public class Box {
    private int length, breadth, height;

    Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    Box(Box box) {
        this.length = box.length;
        this.breadth = box.breadth;
        this.height = box.height;
    }

    Box() {
        length = 0;
        breadth = 0;
        height = 0;
    }

    int volume() {
        return length * breadth * height;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }

}
