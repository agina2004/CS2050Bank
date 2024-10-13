import java.io.Serializable;
import java.util.ArrayList;
import java.io.PrintWriter;

public class AccountStack implements Serializable {
    private ArrayList<ACCOUNT> stack;

    public AccountStack() {
        stack = new ArrayList<>();
    }

    public void push(ACCOUNT account) {
        stack.add(account);
    }


    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void writeStackToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (ACCOUNT account : stack) {
                writer.println(account);
            }
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
