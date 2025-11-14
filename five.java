public class five {
    private double length;
    private double width;

    public five(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        five rectangle = new five(5.0, 10.0);
        System.out.println("Area: " + rectangle.calculateArea());
    }
}