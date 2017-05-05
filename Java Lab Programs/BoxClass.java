public class BoxClass {
    public static void main(String args[]) {
        Box box = new Box(10, 20, 30);
        System.out.println(box.volume());
        Box box1 = new Box(box);
        System.out.println(box.volume());
        Box box2 = new Box();
        BoxWeight boxWeight = new BoxWeight(2, 5, 10, 1000);
        System.out.print(boxWeight.density());
    }
}
