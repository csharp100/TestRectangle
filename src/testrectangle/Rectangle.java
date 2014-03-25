package testrectangle;

/*
 * Exercise 8.1 from the Liang Java Textbook 8E
 * Comprehensive Version
 */


/**
 *
 * @author Clint Sharp
 */
public class Rectangle {
    
    double width;
    double height;
    
    Rectangle() {
        width = 1;
        height = 1;
    }
    
    Rectangle(double wdth, double hght) {
        width = wdth;
        height = hght;
    }
    
    double getArea() {
        return width * height;
    }
    
    double getPerimeter() {
        return 2 * (width + height);
    }
}