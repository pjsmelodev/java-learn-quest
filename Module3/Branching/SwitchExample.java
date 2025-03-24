public class SwitchExample {
    public static void main(String[] args) {
        int wattage = 10;
        double price;

        switch (wattage) {
            case 40:
                price = 1.20;
                break;
            case 60:
                price = 1.30;
                break;
            case 100:   // no break, will always be processed
                System.out.println("Will always happen -> no break");
            case 150:
                price = 1.15;
                break;
            default:
                price = 0;

        System.out.println(price);
        }
    }
}