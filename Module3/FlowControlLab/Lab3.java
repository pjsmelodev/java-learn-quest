public class Lab3 {
    public static void main(String[] args) {
        // 11.
        String[] monthNames = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

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

        // 7.
        for (int j = 1; j <= 100; j++) {
            if (j == 50 || j == 60) {
                continue;
            }
            else {
                System.out.println(j);
            }
        }

        // Exercise 4:

        // 8.
        int loopCounter = 1;
        while (loopCounter < 12) {
            // 9, 11.
            String month = monthNames[loopCounter];

            switch (month) {
                // 10.
                case "January":
                case "March":
                case "May":
                case "July":
                case "August":
                case "October":
                case "December":
                    System.out.println(month + " has 31 days.");
                    break;
                case "February":
                    System.out.println(month + " has 28 days.");
                    break;
                case "April":
                case "June":
                case "September":
                case "November":
                    System.out.println(month + " has 30 days.");
                    break;
            }
            loopCounter++;
        }

        System.out.println();

        // Challenge Exercise

        String[] weekDays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int daysInMarch = 31;
        int startDay = 5;

        for (String day : weekDays) {
            System.out.print(day + "\t");
        }
        System.out.println();

        int currentDay = 0;
        for (int k = 0; k < startDay; k++) {
            System.out.print("\t");
            currentDay++;
        }

        for (int day = 1; day <= daysInMarch; day++) {
            System.out.print(day + "\t");
            currentDay++;
            if (currentDay % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();

    }
}