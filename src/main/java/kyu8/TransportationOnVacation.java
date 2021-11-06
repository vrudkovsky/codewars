package kyu8;
/**
 * After a hard quarter in the office you decide to get some rest on a vacation.
 * So you will book a flight for you and your girlfriend and try to leave all the mess behind you.
 *
 * You will need a rental car in order for you to get around in your vacation.
 * The manager of the car rental makes you some good offers.
 *
 * Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total.
 * Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
 *
 * Write a code that gives out the total amount for different days(d).
 *
 * 1 ... 3 -> $40
 * 3 ... 7 -> $20 off total
 * 7 ... more -> $50 off total
 *
 */


public class TransportationOnVacation {

    public static int cost(int x) {
        return x * 40;
    }

    public static int rentalCarCost(int d) {
        // Your solution here
        final int COST_PER_DAY = 40;
        return d * COST_PER_DAY - (d >= 7 ? 50 : d >= 3 ? 20 : 0);
    }

    public static void main(String[] args) {

    }
}
