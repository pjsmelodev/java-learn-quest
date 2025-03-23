public class OpDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 12;

        i += j;
        /*
        açúcar para:    i = i + j;
                        i = 10 + 12;
                        i = 22;
        */

        System.out.println(i);
        System.out.println(j);

        j++;
        System.out.println(j);
    }
}