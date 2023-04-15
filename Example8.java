public class Example8 {
   public static void main(String[] args) {
      char operator = '%';                  // assumed either '+', '-', '*', '/' only
      int operand1 = 5, operand2 = 6, result = 0;
      switch (operator) {
         case '+': result = operand1 + operand2; break;
         case '-': result = operand1 - operand2; break;
         case '*': result = operand1 * operand2; break;
         case '/': result = operand1 / operand2; break;
         default: assert false : "Unknown operator: " + operator;  // not plausible here
      }
      System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
   }
}