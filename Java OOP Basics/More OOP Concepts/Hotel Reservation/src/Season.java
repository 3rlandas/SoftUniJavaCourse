public enum Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    int value;

    Season(int selectedSeason) {
        this.value = selectedSeason;
    }

    public int getValue() {
        return value;
    }
}
