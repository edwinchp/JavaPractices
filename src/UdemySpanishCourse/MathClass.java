package UdemySpanishCourse;

public class MathClass {
    public static void main(String[] args){
        final int CONSTANT = 10;
        int base = 5;
        int exp = 5;

        //CONSTANT = 3; Error, unable to change a final variable on execution time

        double result = base;

        System.out.println("Result: " + result);
    }
}
