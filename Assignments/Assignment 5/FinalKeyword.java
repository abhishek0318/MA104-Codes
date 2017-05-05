/**
 *  Abhishek Sharma
 *  Assignment 5 - MA104
 *  16123002
 *  Mathematics and Computing
 */

public class FinalKeyword {
    public static void main(String[] args) {
        System.out.println("Final Keyword has three uses.\n" +
                "\t1. Create constants whose value can't be changed.\n" +
                "\t2. Prevent method overridding in subclass.\n" +
                "\t3. Prevent inheritance of a class.\n");



        final double PI = 3.1416;
        /*
        This statement if uncommented will lead to error as the value of variables
        declared with final keyword cannot be changed after declaration.
        */
        // PI = 3.14159;
    }
}

class Box {
    private double length, base, height;

    public Box(double length, double base, double height) {
        this.length = length;
        this.base = base;
        this.height = height;
    }

    final public double volume() {
        return length * base * height;
    }
}

final class PaintedBox extends Box {
    private String color;

    public PaintedBox(double length, double base, double height, String color) {
        super(length, base, height);
        this.color = color;
    }

    /*
    This function if uncommented will lead to error as volume() method
    in super class is declared as final, hence it can't be overridden.
    public double volume() {
        return super.volume();
    }
    */
}

/*
This class if uncommented will lead to error as PaintedBox class is declared final,
hence it can't be further inherited.
*/

/*
class ShinyPaintedBox extends PaintedBox {
    double shine;
    public ShinyPaintedBox(double length, double base, double height, String color, double shine) {
        super(length, base, height, color);
        this.shine = shine;
    }
}
*/
