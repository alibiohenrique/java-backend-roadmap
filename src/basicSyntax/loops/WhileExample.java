package basicSyntax.loops;

public class WhileExample {

    public static void main(String[] args) {

        // One example:
        int i = 0; // Initialize the control variable

        // Condition to check before each iteration
        while (i < 5) {
            i = i + 1; // Update the control variable
        }
        System.out.println(i);
    }
}

