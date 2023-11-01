package basicSyntax.loops;
public class DoWhileExample {

   public static void main (String[] args) {

      //    We start by setting count to 1.
      //    We use a "do-while" loop to print a message and increment count.
      //    The loop continues to execute as long as count is less than or equal to 5.

      int count = 1;

      do {
         count = count + 1;
      }
      while (count <= 5);
      System.out.println(count);

   }

}
