import calc.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(80);
        System.out.println(calculator.add(1.1));


        calculator.multiply(2.0);
        System.out.println(calculator.multiply(2.0));


        calculator.divide(5.0);
        System.out.println(calculator.divide(5.0));

        calculator.sqrt(44.4);
        System.out.println(Math.sqrt(44.4));

        calculator.exponent(80);
        System.out.println((Math.pow(80,20)));


    }
}
