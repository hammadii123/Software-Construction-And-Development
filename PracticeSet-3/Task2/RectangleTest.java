package Task2;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        
        System.out.println("Initial Length: " + rectangle.getLength());
        System.out.println("Initial Width: " + rectangle.getWidth());
        System.out.println("Initial Area: " + rectangle.calculateArea());
        System.out.println("Initial Perimeter: " + rectangle.calculatePerimeter());

        rectangle.setLength(15.5);
        rectangle.setWidth(10.2);

        System.out.println("\nUpdated Length: " + rectangle.getLength());
        System.out.println("Updated Width: " + rectangle.getWidth());
        System.out.println("Updated Area: " + rectangle.calculateArea());
        System.out.println("Updated Perimeter: " + rectangle.calculatePerimeter());

        rectangle.setLength(25.0); // Should display an error message
        rectangle.setWidth(-5.0);  // Should display an error message
    }
}
