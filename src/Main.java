import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkIsLeapYear(2020);
        checkIsLeapYear(2024);
        checkIsLeapYear(1990);

        defineAppVersion(0, 2024);
        defineAppVersion(1,2021);
        defineAppVersion(3, 1990);

        System.out.println("Количество дней доставки: " + calcCarDeliveryDays(40));
        System.out.println("Количество дней доставки: " + calcCarDeliveryDays(80));
        System.out.println("Количество дней доставки: " + calcCarDeliveryDays(2));
    }
    private static void checkIsLeapYear(int year) {
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }

    private static void defineAppVersion(int mobileOs, int mobileYear) {
        String mobileOsName;

        switch (mobileOs){
            case 0:
                mobileOsName = " Android";
                break;
            case 1:
                mobileOsName = " iOS";
                break;
            default:
                mobileOsName = " неизвестная ОС";
        }
        int currentYear = LocalDate.now().getYear();
        if (mobileYear != currentYear) {
            System.out.println("Для ОС" + mobileOsName + " установите lite-версию");
        } else {
            System.out.println("Для ОС" + mobileOsName + " установите обычную версию");
        }
    }
    private static int calcCarDeliveryDays(int distance){
        int deliveryDays;

        if (distance <= 20){
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else {
            deliveryDays = 3;
        }

        return deliveryDays;
    }
}