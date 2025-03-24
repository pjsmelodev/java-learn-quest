public class SwitchDaysWeek {

    public String typeOfDay(String dayOfWeekArg) {
        String typeOfDay;

        switch (dayOfWeekArg) {
            case "Monday":
                typeOfDay = "Start of work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Friday":
                typeOfDay = "End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
                throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
        }

        return typeOfDay;
    }

    public static void main(String[] args) {
        SwitchDaysWeek switchDaysWeek = new SwitchDaysWeek();

        String day = "Monday";
        String type = switchDaysWeek.typeOfDay(day);

        System.out.println("Day: " + day + ", Type: " + type);
    }
}
