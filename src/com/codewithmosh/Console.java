package com.codewithmosh;

import java.util.Scanner;

public class Console {
    private static Scanner insette = new Scanner(System.in); //EK VESTAAN DIT, maar hoekom "private" en "static" ??

    public static double readNumber(String prompt) { //METHOD CALLED "readNumber"
        return insette.nextDouble(); //
    }

    public static double readNumber(String prompt, double min, double max) {  //METHOD NAMED "Console.readNumber" WITH PARAMETERS FOR PROMPT/MIN/MAX
        double value; //DECLARE A VARIABLE CALLED "VALUE"
        while (true) { // DO WHILE THE FOLLOWING IS TRUE:
            System.out.print(prompt); //"PROMPT" IS DEFINED IN MAIN CLASS
            value = insette.nextDouble(); //VARIABLE DECLARED EARLIER NOW POPULATED WITH SCANNER'S COLLECTION. VALUE IS A DOUBLE-TYPE VARIABLE
            if (value >= min && value <= max) // GETTING VALUES FROM MAIN FOR MIN/MAX.
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
