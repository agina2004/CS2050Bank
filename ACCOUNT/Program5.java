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
import java.util.Random;


public class Program5 {
    public static long generateAccountNumber() {
        Random rand = new Random();
        return 1000000000L + (long) (rand.nextDouble() * 8999999999L);
    }

    public static void main(String[] args) {
        AccountStack checkStack = new AccountStack();
        AccountStack saveStack = new AccountStack();

        for (int i = 0; i < 25; i++) {
            Checking newChecking = new Checking(generateAccountNumber(), 1000, 2.2, 300.5);
            checkStack.push(newChecking);
        }

        for (int i = 0; i < 25; i++) {
            Savings newSavings = new Savings(generateAccountNumber(), 10000, 3.3, 10000, 10, 1000);
            saveStack.push(newSavings);
        }

        checkStack.writeStackToFile("CheckStack.txt");
        saveStack.writeStackToFile("SaveStack.txt");
    }


    }
