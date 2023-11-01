package basicSyntax.loops;

public class ForExample {

    public static void main(String[] args) {

        //             One example:
        //       "i" initialize being 0
        //       The condition for the loops keeps executing is when "i" is lesser than 5.
        //       The loop will continue until "i" is greater than 5 and
        //       everytime this loop returns, the variable "i" receives what has on him, plus one.

        for (int i = 0; i < 5; i = i + 1) {
            System.out.println(i);
        }

    }

}

//   - Initialization:
//      Where you initialize a control variable (usually an integer) to a starting value.
//      Runs once before the block.

//   - Condition:
//      Is checked before each iteration.
//      The loop continues as long as this condition is true.

//   - Iteration:
//      Runs every time after the block has executed.
//      Typically, you increment the control variable.

//      for (Initialization; Condition; Iteration) {
//              // code block to be executed
//              }