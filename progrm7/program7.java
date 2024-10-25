/* 
 * program:6 due:10/6/2024
 *  name: ahmed abou agina 
 * description
 * A bank system oversees collections of checking and savings accounts stored in files named CheckStack.txt and SaveStack.txt 
 * respectively.The checking accounts hold a balance of $ 1000 with a 2. 2 % Interest rate and no overdraft protection.Savings 
 * accounts begin with a $ 10 000 balance and a 3. 3 % Interest rate; they also receive $ 1000 contributions, over ten periods.
 * These account specifics are likely utilized in a Java program, for simulating account transactions and 
 * management using CheckStack and SaveStack files. 
 * 
 * with the addition of the customer class customer name,customer ID and the Account Details the account number
 *  is generated every single time so it will be different and then written to queue and stored in a file calld  Customer
 * 
 * 
 * the generateTransactionAmou by either increasing or decreasing the balance held in the account stack 
 * systemically through adding or subtractive actions based on customer interactions, with their account status 
 * and information availability to ensure processing, for customers. 
 * 
**************************/
import java.util.LinkedList;
import java.util.Random;
import java.io.IOException;
import java.util.Queue;
import java.io.FileWriter;

public class program7 {
    public static long generateAccountNumber() {
        Random rand = new Random();
        return 1000000000L + (long) (rand.nextDouble() * 8999999999L);
    }
    public static double generateTransactionAmount() {
        Random rand = new Random();
        return rand.nextDouble() * 2000 - 1000;
    }


    public static void writeQueueToTextFile(Queue<customer> customerQueue, String customers) {
        try (FileWriter writer = new FileWriter(customers)) {
            for (customer cust : customerQueue) {
                writer.write(cust.toString() + "\n");
            }
            System.out.println("Customer queue has been written to the text file: " + customers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {


        Queue<customer> customerQueue = new LinkedList<>();
        AccountStack checkStack = new AccountStack();
        AccountStack saveStack = new AccountStack();



        customerQueue.add(new customer("Customer0", 0, null));
        customerQueue.add(new customer("Customer1", 1, new Savings(generateAccountNumber(), 10000, 3.3, 10000, 10, 1000)));
        customerQueue.add(new customer("Customer2", 2, new Checking(generateAccountNumber(), 1000, 2.2, 300)));
        customerQueue.add(new customer("Customer3", 3, new Savings(generateAccountNumber(), 10000, 3.3, 10000, 10, 1000)));
        customerQueue.add(new customer("Customer4", 4, new Checking(generateAccountNumber(), 1000, 2.2, 300)));
        customerQueue.add(new customer("Customer5", 5, new Savings(generateAccountNumber(), 10000, 3.3, 10000, 10, 1000)));
        customerQueue.add(new customer("Customer6", 6, new Checking(generateAccountNumber(), 1000, 2.2, 300)));
        customerQueue.add(new customer("Customer7", 7, new Savings(generateAccountNumber(), 10000, 3.3, 10000, 10, 1000)));
        customerQueue.add(new customer("Customer8", 8, new Checking(generateAccountNumber(), 1000, 2.2, 300)));
        customerQueue.add(new customer("Customer9", 9, new Savings(generateAccountNumber(), 10000, 3.3, 10000, 10, 1000)));
        customerQueue.add(new customer("Customer10", 10, new Checking(generateAccountNumber(), 1000, 2.2, 300)));
        customerQueue.add(new customer("Customer11", 11, null));
        customerQueue.add(new customer("Customer12", 12, null));
        customerQueue.add(new customer("Customer13", 13, null));
        customerQueue.add(new customer("Customer14", 14, new Checking(generateAccountNumber(), 1000, 2.2, 300)));
        customerQueue.add(new customer("Customer15", 15, new Savings(generateAccountNumber(), 10000, 3.3, 10000, 10, 1000)));
        customerQueue.add(new customer("Customer16", 16, new Checking(generateAccountNumber(), 1000, 2.2, 300)));
        for (int i = 0; i < 30; i++) {

            customer currentCustomer = customerQueue.poll();
            if (currentCustomer.getAccount() == null) {
                if (!saveStack.isEmpty()) {
                    currentCustomer.setAccount(saveStack.pop());
                    System.out.println("Assigned Checking account to " + currentCustomer.getName());
                } else if (!checkStack.isEmpty()) {
                    currentCustomer.setAccount(checkStack.pop());
                    System.out.println("Assigned Savings account to " + currentCustomer.getName());
                }
                else {
                    System.out.println("No available accounts to assign to " + currentCustomer.getName());
                }
            }

            if (currentCustomer.getAccount() != null) {
                double transactionAmount = generateTransactionAmount();
                if (transactionAmount >= 0) {
                    currentCustomer.getAccount().setACCOUNTbalance(
                            currentCustomer.getAccount().getACCOUNTbalance() + (int) transactionAmount);
                    System.out.println("Deposited $" + transactionAmount + " to " + currentCustomer.getName() + "'s account.");
                } else {
                    currentCustomer.getAccount().setACCOUNTbalance(
                            currentCustomer.getAccount().getACCOUNTbalance() + (int) transactionAmount); 
                    System.out.println("Withdrew $" + (-transactionAmount) + " from " + currentCustomer.getName() + "'s account.");
                }
            } else {
              
                System.out.println("Skipping transaction for " + currentCustomer.getName() + " as they have no account.");
            }

            customerQueue.add(currentCustomer); 
        }

        System.out.println("\nFinal Customer Details:");
        for (customer cust : customerQueue) {
            System.out.println("Customer ID: " + cust.getCustomerID() +
                    ", Name: " + cust.getName() +
                    ", Account: " + cust.getAccount());
        }

        writeQueueToTextFile(customerQueue, "customers.txt");



    }


 




}
