public class Conditionals {
    public static void main(String[] args) {
        int x = 12;
        int y = -35;
        int z;

        if (x < y) {
            System.out.println("X is less than Y");

            z = y - x;

            System.out.println("The value of Z is: " + z);
        }
        else {
            System.out.println("Y is less than X");
        }
    }
}