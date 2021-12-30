public class Calculator2Test {
   
   public static void main(String[] args) {
  
    Calculator2 x = new Calculator2();
       x.setNumberOne(1.5);
       x.setNumberTwo(1.5);
       x.setOperation("*");
       x.performOperation();
       x.getOperation();
   }
}
