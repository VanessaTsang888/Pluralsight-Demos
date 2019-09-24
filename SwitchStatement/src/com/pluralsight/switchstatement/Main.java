package com.pluralsight.switchstatement;

public class Main {

    public static void main(String[] args) {
	// example of a small program using switch statement.
        int iVal = 10;

        switch (iVal % 2) {
            case 0: // if iVal divide 2, the modular is 0, then run this case.
                System.out.println(iVal);
                System.out.println(" is even"); // will run this if this condition is met.
                break; // Run until you reach this point then jump out of this switch statement.
            case 1: // iVal is 25, then this will run.
                System.out.println(iVal);
                System.out.println(" is odd");
                break;
            default:
                System.out.println("oops it broke");
                break; // good programming practice is to put break at the end.


        }
    }
}
