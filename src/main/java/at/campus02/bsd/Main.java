package at.campus02.bsd;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Main {
     private static Logger log = LogManager.getLogger(Main.class);

    static void main() {
       Calculator calculator = new at.campus02.bsd.Calculator();
       double add = calculator.add(1,2);
       double subs = calculator.subtract(1,2);
       double mult = calculator.multiply(1,2);
       double div = calculator.divide(1,2);
       double add2 = calculator.add(2,4);
       double sub2 = calculator.subtract(5,9);
       double mult2 = calculator.multiply(1,9.5);
       double div2 = calculator.divide(17,0);
        System.out.println(add+" "+subs+" "+mult+" "+div);
        System.out.println(add2+" "+sub2+" "+mult2+" "+div2);
        System.out.println("Claudia Cañamero Ballestar");

        log.info("info");
        log.error("error");

    }
}