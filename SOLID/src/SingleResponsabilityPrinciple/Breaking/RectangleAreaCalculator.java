package SingleResponsabilityPrinciple.Breaking;

public class RectangleAreaCalculator {

    private static final double INCH_TERM = 0.0254d;

    private final int width;
    private final int height;

    public RectangleAreaCalculator(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }
    /* this method breaks SRP
    * The situation can be remedied by removing the metersToInches() method
    * and create a new class to handle conversions
    * */
    public double metersToInches(int area) {
        return area / INCH_TERM;
    }

}
