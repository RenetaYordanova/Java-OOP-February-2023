package P02CarShopExtended;

public class Audi extends CarImpl implements Rentable{
    private double pricePerDay;
    private int minRentDays;

    public Audi(String model, String color, Integer horsepower, String countryProduced,
                Integer minRentDays,Double pricePerDay) {
        super(model, color, horsepower, countryProduced);

        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public int getMinRentDay() {
        return minRentDays;
    }

    @Override
    public double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("%s\nMinimum rental period of %d days. Price per day %f",super.toString(),getMinRentDay(),getPricePerDay());
    }
}
