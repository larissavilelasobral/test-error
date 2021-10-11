package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("First Example");

        int january = 15; // 15 mil
        int march = 17; // 17 mil
        int february = 23; // 23 mil

        // calculate the total average for the quarter
        int total = january + march + february;

        System.out.println("The total average: " + total);

        int spendingAverage = (january + march + february)/3;

        System.out.println("The spending average: " + spendingAverage);

    }
}
