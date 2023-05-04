public enum DiscountType {
    VIP(20),
    SecondVisit(10),
    None(0);

    int selectedDiscount;

    DiscountType(int selectedDiscount) {
        this.selectedDiscount = selectedDiscount;
    }

    public int getSelectedDiscount() {
        return selectedDiscount;
    }
}
