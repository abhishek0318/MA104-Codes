public class BoxWeight extends Box {
    private int weight;
    BoxWeight(int length, int breadth, int height, int weight) {
        super(length, breadth, height);
        this.weight = weight;
    }

    double density() {
        return weight / volume();
    }
}
