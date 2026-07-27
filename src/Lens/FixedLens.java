package Lens;

public class FixedLens implements LensSimulation {
    private double radius;
    private double height;

    public FixedLens(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getOuterOffset() {
        return radius - (Math.sqrt(Math.pow(radius, 2) - Math.pow(height, 2)));
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }
}
