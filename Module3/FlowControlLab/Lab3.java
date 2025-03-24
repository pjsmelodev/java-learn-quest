public class Lab3 {
    public static void main(String[] args) {
        // Exercise 1

        // 2.
        String[] daysOfWeek = {
                "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday"
        };

        // 3.
        // "regular" for loop
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);
        }

        System.out.println();

        // enhanced for loop
        for (String day : daysOfWeek) {
            System.out.println(day);
        }

        System.out.println();

        // 4.
        for (int i = daysOfWeek.length - 1; i >= 0; i--) {
            System.out.println(daysOfWeek[i]);
        }

        System.out.println("_______________________________");

        // Exercise 2

        // 5, 6.
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            }
            else {
                i++;
                continue;
            }
        }

        // Exercise 3:


    }
}