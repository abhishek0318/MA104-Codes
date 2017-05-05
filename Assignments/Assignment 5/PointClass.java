/**
 *  Abhishek Sharma
 *  Assignment 5 - MA104
 *  16123002
 *  Mathematics and Computing
 */

class Point {
    int x, y;
    Point(int a, int b) {
        x = a;
        y = b;
    }

    //Override equals() to check whether two objects of Point are equal.
    public boolean equals(Point point) {
        return (this.x == point.x && this.y == point.y);
    }

    //Override to String() to print member variables of Point objects.
    @Override
    public String toString() {
        return "x:" + String.valueOf(x) + ", y:" + String.valueOf(y);
    }


    //Override finalize() so that it prints an message at the time of object deletion.
    @Override
    protected void finalize() {
        System.out.println("Point object (" + toString() + ") is collected ");
    }
}

class PointClass {
    public static void main(String arg[]) {
        Point a, b, c;
        a = new Point(3, 5);
        b = new Point(0, 0);
        c = new Point(3, 5);

        System.out.println("Point 'a' equals point 'b'? " + a.equals(b));
        System.out.println("Point 'a' equals point 'c'? " + a.equals(c));
        System.out.println("Point 'a': " + a.toString());

    }
}