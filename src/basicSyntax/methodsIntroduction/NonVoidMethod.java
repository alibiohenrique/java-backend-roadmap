package basicSyntax.methodsIntroduction;
public class NonVoidMethod {

   public static void main (String[] args) {

      // In the main method, we call the subtract
      // method with values 25 and 25.

      int result = subtract(25, 25);
      System.out.println(result);

      // The returned result is stored in the "result" variable,
      // and we can use it in the main method to do anything that we want.

   }

   public static int subtract (int numberOne, int numberTwo) {

      int result = numberTwo - numberOne;

      // The subtract method calculates the result and returns it,
      // using the keyword "return".

      return result;

   }
}

