package calc;

public class Calculator {

    public double defaultValue;

    public Calculator(double defaultValue){
        this.defaultValue= defaultValue;
    }

    public double add(double valueToAdd){
        return this.defaultValue + valueToAdd;
    }


    public double multiply(double valueToMultiply){
        return this.defaultValue * valueToMultiply;
    }

    public double divide(double valueToDivide){
        return this.defaultValue / valueToDivide;
    }

    public double sqrt(double a){
        return this.defaultValue;

}


    public double exponent (double valueToPower){
        return Math.pow(this.defaultValue,valueToPower);
    }

}
