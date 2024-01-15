package P04HorelReservation;

public class PriceCalculator {

    public static double calculatePrice(double pricePerDay, int numbersOfDays, Season season, Discount discount) {

        double basedPrice=pricePerDay*numbersOfDays* season.getMultiplier();

        return basedPrice*(1 - discount.getDiscount());
    }
}

