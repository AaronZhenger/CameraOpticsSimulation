package Lens;

public class ZoomLens implements LensSimulation {
    private double radius;
    private double outerOffset;

    public ZoomLens(double radius, double outerOffset) {
        this.radius = radius;
        this.outerOffset = outerOffset;
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
        return outerOffset;
    }

    @Override
    public double getHeight() {
        return Math.sqrt(Math.pow(radius, 2) - Math.pow(radius - outerOffset, 2));
    }

    @Override
    public void setHeight(double height) {}
}
