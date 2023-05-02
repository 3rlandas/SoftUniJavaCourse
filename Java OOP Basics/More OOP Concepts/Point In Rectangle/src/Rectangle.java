public class Rectangle {
    private int bottomLeftX;
    private int bottomLeftY;
    private int topRightX;
    private int topRightY;


    public int getTopRightY() {
        return topRightY;
    }

    public int getTopRightX() {
        return topRightX;
    }

    public int getBottomLeftY() {
       return bottomLeftY;
    }

    public int getBottomLeftX() {
        return bottomLeftX;
    }

    public Rectangle(int bottomLeftX, int bottomLeftY, int topRightX, int topRightY) {

        this.bottomLeftX = bottomLeftX;
        this.bottomLeftY = bottomLeftY;
        this.topRightX = topRightX;
        this.topRightY = topRightY;
    }

    public boolean contains(Point point) {

        boolean isHorizontal = point.getX() >= bottomLeftX && point.getX() <= topRightX;
        boolean isVertical = point.getY() >= bottomLeftY && point.getY() <= topRightY;

        return isHorizontal && isVertical;
    }
}
