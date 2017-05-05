/**
 * Created by abhishek on 15/4/17.
 */
public class TryCatch {
    public static void errorFunction() {
        System.out.println(2 / 0);
    }
    public static void main(String[] args) {
        try {
            // errorFunction();
            System.out.println("Try");
        }
        catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            System.out.println(e.getLocalizedMessage());
            // e.printStackTrace();
        }
        finally {
            System.out.println("Finally");
        }
    }
}
