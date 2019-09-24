package com.pluralsight.letsgetlogical2;

public class Main {

    public static void main(String[] args) {
	// Logical And vs. Conditional Logical And.
        int students = 150;
        int rooms = 0;
        // if the result of students divided by rooms is greater than 30, then print-out Crowded.
        if (rooms > 0 && students/rooms > 30) // two tests. It can do the right-handside if the left-hand side is true.
            System.out.println("Crowded!");
        // if

        System.out.println();
        System.out.println("** end program **");
    }
}
