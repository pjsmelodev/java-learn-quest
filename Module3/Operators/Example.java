public class Exemple {
    public static void main(String[] args) {
        int i, j;

        i = 42;
        j = 21;

        System.out.println("i : " + i);
        System.out.println("j : " + j);
        System.out.println("____________________");

        i = j;
        j = j++;

        System.out.println("i : " + i);
        System.out.println("j : " + j);
        System.out.println("____________________");

        i = i + j;
        System.out.println("i : " + i);
    }
}