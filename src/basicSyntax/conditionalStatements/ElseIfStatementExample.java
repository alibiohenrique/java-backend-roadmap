package basicSyntax.conditionalStatements;

public class ElseIfStatementExample {

   public static void main (String[] args) {

      int score = 85;

      if (score >= 90) {
         // If the score is greater than
         // or equal to 90, execute this block
      }
      else if (score >= 80) {
         // If the first condition is not met (score < 90),
         // since the score is greater than or equal to 80,
         // this block of code executes.
      }

   }

}
