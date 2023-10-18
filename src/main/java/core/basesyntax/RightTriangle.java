package core.basesyntax;

public class RightTriangle extends GeometryFigure implements Figure {
    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: "
                + getArea() + " sq. units, base: "
                + base
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }
}