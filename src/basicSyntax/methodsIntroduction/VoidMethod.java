package basicSyntax.methodsIntroduction;
public class VoidMethod {

   public static void main (String[] args) {

      // In the main method, we call the "subtract" method with values 25 and 25, as "parameters".

   }

   public static void subtract (int numberOne, int numberTwo) {

      // This is the "subtract" method.

      int result = numberTwo - numberOne;
      System.out.println(result);

      // It calculates the result of subtracting numberTwo by numberOne.
      // But the result of result variable is not used in the main method,
      // just inside the subtract method.

   }
}
