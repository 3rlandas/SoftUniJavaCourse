public class PriceCalculator {

    public static double calculatePrice(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {

        int multiplier = season.getValue();

        double discountMultiplier = discountType.getSelectedDiscount() / 100.0;
        double priceWithoutDiscount = (numberOfDays * pricePerDay) * multiplier;
        double discountAmount = priceWithoutDiscount * discountMultiplier;
        return priceWithoutDiscount - discountAmount;

    }
}
