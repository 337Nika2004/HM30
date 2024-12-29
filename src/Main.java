import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задача 1: Проверка на високосный год
        System.out.println("Задача 1");
        checkLeapYear(2024);
        checkLeapYear(2023);

        // Задача 2: Установка приложения
        System.out.println("\nЗадача 2");
        recommendAppVersion(0, 2014); // iOS, старше 2015
        recommendAppVersion(1, 2020); // Android, после 2015

        // Задача 3: Расчет дней доставки
        System.out.println("\nЗадача 3");
        System.out.println("Потребуется дней: " + calculateDeliveryDays(15)); // В пределах 20 км
        System.out.println("Потребуется дней: " + calculateDeliveryDays(50)); // От 20 до 60 км
        System.out.println("Потребуется дней: " + calculateDeliveryDays(95)); // От 60 до 100 км
        System.out.println("Потребуется дней: " + calculateDeliveryDays(150)); // Свыше 100 км
    }

    // Задача 1: Метод для проверки високосного года
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }
    }

    // Задача 2: Метод для рекомендации версии приложения
    public static void recommendAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = osType == 0 ? "iOS" : "Android";
        if (deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке.");
        } else {
            System.out.println("Установите обычную версию приложения для " + osName + " по ссылке.");
        }
    }

    // Задача 3: Метод для расчета дней доставки
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            System.out.println("Доставка не осуществляется на расстояние более 100 км.");
            return 0; // Нулевая доставка
        }
    }
}