public class Recursion {
    public static void main(String[] args) {
        sayHi(5);
    }

    public static void sayHi (int count){
        System.out.println("Hi!");

        if (count <= 1) return;

        sayHi(count-1);
    }
}
