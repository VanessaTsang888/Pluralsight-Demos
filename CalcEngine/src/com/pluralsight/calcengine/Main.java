package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        // the below first 4 Arrays are parallel Arrays.
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        // store the above char's in result as a double array as well.
        // initialise it with space to hold to hold the different results.
        double[] results = new double[opCodes.length]; // same size as opCode.

/*      double val1 = 100.0d;
        double val2 = 50.0d;
        double result;
        char opCode = 'd';*/

// we can process multiple values, it's much more readable case statement.

        for (int i = 0; i < opCodes.length; i++) {
            // This is a switch statement but can only be used for char and integer types.
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break; // we need a break statement so it don't fall through.
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d; // this one line replaces the below commented lines.
                    break;
            /*if (val2 != 0.0d)
            result = val1 / val2;
            else
                result = 0.0d;*/
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0d;
                    break;
            }
        }

        // another loop to print out the results.

        for (double theResult : results) {
            System.out.println("result = ");
            System.out.println(theResult);
        }

    }
}
