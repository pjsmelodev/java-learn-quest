public class MultiLineElseBlock {
    public static void main(String[] args) {
        int x = 12;

        if (x < 7) {
            System.out.println("X is less than 7.");
            y = x - 5;
            z = y + x;
        }
        else {
            System.out.println("X is NOT less than 7.");
            y = x + 5;
            z = y - x;
        }
    }
}