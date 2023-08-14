public class Circle extends Shape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(this.getRadius() * 2 * Math.PI);
    }

    @Override
    protected void calculateArea() {
        setArea(this.getRadius() * this.getRadius() * Math.PI);
    }
}