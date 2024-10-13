/**************************
 * program:5 due:10/6/2024
 *  name: ahmed abou agina 
 * description
 * A bank system oversees collections of checking and savings accounts stored in files named CheckStack.txt and SaveStack.txt 
 * respectively.The checking accounts hold a balance of $ 1000 with a 2. 2 % Interest rate and no overdraft protection.Savings 
 * accounts begin with a $ 10 000 balance and a 3. 3 % Interest rate; they also receive $ 1000 contributions, over ten periods.
 * These account specifics are likely utilized in a Java program, for simulating account transactions and 
 * management using CheckStack and SaveStack files. 
**************************/
import java.util.LinkedList;
import java.util.Random;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Queue;


public class Program5 {
    public static long generateAccountNumber() {
        Random rand = new Random();
        return 1000000000L + (long) (rand.nextDouble() * 8999999999L);
    }





    public static void main(String[] args) {


        Queue<customer> customerQueue = new LinkedList<>();
        AccountStack checkStack = new AccountStack();
        AccountStack saveStack = new AccountStack();


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


        writeQueueToFile(customerQueue, "customers");
    }


    public static void writeQueueToFile(Queue<customer> customerQueue, String Customers) {
        try (FileOutputStream fileOut = new FileOutputStream(Customers);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(customerQueue);
            System.out.println("Customer queue has been serialized to the file: " + Customers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
