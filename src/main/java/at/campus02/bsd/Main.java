package at.campus02.bsd;

public class Main {
    static void main() {
       Calculator calculator = new Calculator();
       double add = calculator.add(1,2);
       double subs = calculator.subtract(1,2);
       double mult = calculator.multiply(1,2);
       double div = calculator.divide(1,2);
        System.out.println(add+" "+subs+" "+mult+" "+div);
        System.out.println("Claudia Cañamero Ballestar");
    }
}