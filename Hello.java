
class Calculator{

    public int add(int a, int b){
        return a+b;
    }   
}



class ExtendedCalculator extends Calculator{
  
    public int add(int a, int b){
        System.out.println("Adding " + a + " and " + b);
        return super.add(a, b);
    }


    public int multiply(int a, int b){
        return a*b;
    }   
}





class AdvancedCalculator extends ExtendedCalculator{
  
    public int add(int a, int b){
        System.out.println("Advanced Adding " + a + " and " + b);
        return super.add(a, b);
    }

    public int multiply(int a, int b){
        System.out.println("Multiplying " + a + " and " + b);
        return super.multiply(a, b);
    }   
}









public class Hello {

    public static void main(String[] args) {

        AdvancedCalculator calc = new AdvancedCalculator();
        int sum = calc.add(5, 10);
        int product = calc.multiply(5, 10);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}



