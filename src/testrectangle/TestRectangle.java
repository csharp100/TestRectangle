package testrectangle;

/*
 * Exercise 8.1 from the Liang Java Textbook 8E
 * Comprehensive Version
 */


/**
 *
 * @author Clint Sharp
 */
public class TestRectangle {

    public static void main(String[] args) {
        
        Rectangle rectangleOne = new Rectangle(4, 40);
        Rectangle rectangleTwo = new Rectangle(3.5, 35.9);
        System.out.println("Area of rectangle 1 is: " + rectangleOne.getArea());
        System.out.println("Area of rectangle 2 is: " + rectangleTwo.getArea());
        System.out.println("Perimeter of rectangle 1 is: " + rectangleOne.getPerimeter());
        System.out.println("Perimeter of rectangle 2 is: " + rectangleTwo.getPerimeter());
               
    }
    
}
