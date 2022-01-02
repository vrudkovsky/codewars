package kyu8;

// In this kata you will have to write a function that takes litres and pricePerLitre (in dollar) as arguments.
//
// Purchases of 2 or more litres get a discount of 5 cents per litre,  litres > 2 => 5%
// purchases of 4 or more litres get a discount of 10 cents per litre, litres > 4 => 10%
// and so on every two litres, up to a maximum discount of 25 cents per litre. litres > 4 => 10%
// But total discount per litre cannot be more than 25 cents.
// Return the toal cost rounded to 2 decimal places.
// Also you can guess that there will not be negative or non-numeric inputs.
//
//Good Luck!

//litres > 2 => 5%
//litres > 4 => 10%
//litres > 6 => 15%
//litres > 8 => 20%
//litres > 10 => 25%
//litres > 12 => 25%
//litres > 14 => 25%
//litres > 16 => 25%



public class FuelCalculator {
    public static double fuelPrice(int litres, double pricePerLiter) {
        double total = litres * pricePerLiter;
        total -= calcDiscount(litres);
        return total;
    }

    private static double calcDiscount(int litres) {
        if (litres >= 10)
            return 0.25 * litres;
        if (litres >= 8)
            return 0.2 * litres;
        if (litres >= 6)
            return 0.15 * litres;
        if (litres >= 4)
            return 0.10 * litres;
        if (litres >= 2)
            return 0.05 * litres;
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println(fuelPrice(8, 2.5d));
    }
}
