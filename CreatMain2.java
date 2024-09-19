/*The accompanying Java program builds a Circle class with a single attribute, radius, and a method calculateCircumference() that calculates a circle's circumference using the formula 2 * π * radius. 
The main function creates a Circle object with a radius of 5 and calls the calculateCircumference() method to calculate the circumference, which is then printed. */

public class CreatMain2 {

    // Define the Circle class
    static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculateCircumference() {
            return 2 * Math.PI * radius;
        }

        public double getRadius() {
            return radius;
        }
    }

    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5);

        // Calculate the circumference of the circle
        double circumference = circle.calculateCircumference();

        // Print the circumference of the circle
        System.out.println("Circumference: " + circumference);
    }
}