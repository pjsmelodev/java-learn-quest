public class ForEach {
    public static void main(String[] args) {
        String[] sa = {"o1", "o2", "o3"};

        for (String s : sa) {
            System.out.println(s);  //s.ToString() -> redundante (já é string)
        }

        System.out.println();

        Integer[] ia = {1, 2, 3};

        for (Integer i2 : ia) {
            System.out.println(i2); //i2.IntValue() -> redundante (autounboxing)
        }
    }
}