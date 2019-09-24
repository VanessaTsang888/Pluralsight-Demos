package com.pluralsight.nestedifs;

public class Main {

    public static void main(String[] args) {
	// nest one if statement inside another. We have declared 2 variables, students and rooms.
            float students = 0.0f;
            float rooms = 1.0f;

            if (students > 0.0f) {
                // only do this if rooms is greater than 0.
                // this brace prevents the else statement matching up with the if students statement.
                if (rooms > 0.0f)
                    System.out.println(students / rooms);
                } // closed the if rooms statement. Now the "No students prints out"
            else
                System.out.println("No students");

            System.out.println();
            System.out.println("** end program **");
        }
    }
