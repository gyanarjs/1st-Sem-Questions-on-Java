public class AreaCalculator {
    public static void main(String[] args) {
        // Calculate and print the area of a circle with radius 5
        System.out.println("Area of circle: " + area1(5.0));

        // Calculate and print the area of a rectangle with length 4 and width 6
        System.out.println("Area of rectangle: " + area2(4.0, 6.0));

        // Calculate and print the area of a square with side length 3
        System.out.println("Area of square: " + area3(3.0));
    }

    // Method to calculate area of a circle
    public static double area1(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a rectangle
    public static double area2(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a square (overloaded version)
    public static double area3(double side) {
        return side * side;
    }
}