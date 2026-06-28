package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger log = LogManager.getLogger(Main.class);

    public double add(double number1, double number2){
        double result = number1 + number2;
        log.debug("ADD METHOD: parameters given: "+number1+","+number2);
        log.debug("ADD METHOD: result: "+result);
        return result;
    }

    public double subtract(double number1, double number2){
        double result = number1 - number2;
        log.debug("SUBSTRACT METHOD: parameters given: "+number1+","+number2);
        log.debug("SUBSTRACT METHOD: result: "+result);
        return result;
    }

    public double divide(double number1, double number2){
        if(number2 == 0) {
            log.error("DIVIDE METHOD: parameters given: "+number1+","+number2+" impossible to divide to 0");
            return -1;
        }else{

            double result = number1 / number2;
            log.debug("DIVIDE METHOD: parameters given: "+number1+","+number2);
            log.debug("DIVIDE METHOD: result: "+result);
            return result;
        }
    }

    public double multiply(double number1, double number2){
        double result = number1 * number2;
        log.debug("MULTIPLY METHOD: parameters given: "+number1+","+number2);
        log.debug("MULTIPLY METHOD: result: "+result);
        return result;
    }
}
