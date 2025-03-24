public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 20;
        int n = 20;

        do {    // will execute at least once
            System.out.print("DW");
            count++;
        }
        while (count < n);  // if the test is evaluated as True, it will keep going
    }
}