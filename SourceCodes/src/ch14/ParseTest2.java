/*Modify ParseTest.java by adding a catch block for Exception, before the catch block for
ParseException. Why does this generate a compiler error? Because catch ParseException is already handled by catch Exception*/


package ch14;

import java.text.NumberFormat;
import java.text.ParseException;

public class ParseTest2 {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String s;
        Number num;
        s = "$45.67";
        // s = "hi mom";

        try {
            num = format.parse(s); // may generate exception
            System.out.println("Float value = " + num.floatValue());
        }
/*        catch (Exception e) {
        	
        }*/
        catch (ParseException e) {
            System.err.println("Invalid string \"" + s + "\"");
        }
    }
}