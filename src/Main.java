import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        printLeapYear (2023);
        printLeapYear (2020);
        System.out.println();

        System.out.println("Задача 2");
        printVersionOfApp (1, 2020);
        printVersionOfApp (0, 2023);
        printVersionOfApp (1, 2023);
        printVersionOfApp (0, 2020);
        System.out.println();

        System.out.println("Задача 3");
        int deliveryDays1 = calculateDeliveryDays (15);
        if (deliveryDays1 > 0) {
            System.out.println("Потребуется дней: " + deliveryDays1);
        } else {
            System.out.println("Доставки нет");
        }

        int deliveryDays2 = calculateDeliveryDays (25);
        if (deliveryDays2 > 0) {
            System.out.println("Потребуется дней: " + deliveryDays2);
        } else {
            System.out.println("Доставки нет");
        }

        int deliveryDays3 = calculateDeliveryDays (65);
        if (deliveryDays3 > 0) {
            System.out.println("Потребуется дней: " + deliveryDays3);
        } else {
            System.out.println("Доставки нет");
        }

        int deliveryDays4 = calculateDeliveryDays (-10);
        if (deliveryDays4 > 0) {
            System.out.println("Потребуется дней: " + deliveryDays4);
        } else {
            System.out.println("Доставки нет");
        }

        int deliveryDays5 = calculateDeliveryDays (110);
        if (deliveryDays5 > 0) {
            System.out.println("Потребуется дней: " + deliveryDays5);
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void printLeapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " - високосный");
        } else {
            System.out.println("Год " + year + " - не является високосным");
        }
    }
    public static void printVersionOfApp (int os, int deviceYear) {
        if (os != 0 && os != 1) {
            System.out.println("Информация об ОС не корректна");
            return;
        }

        int currentYear = LocalDate.now().getYear();
        StringBuilder stringBuilder = new StringBuilder ("Установите ");

        if (deviceYear < currentYear) {
            stringBuilder.append("облегченную ");
        } else {
            stringBuilder.append("обычную ");
        }

        stringBuilder.append("версию приложения для ");

        if (os == 0) {
            stringBuilder.append("iOS ");
        } else {
            stringBuilder.append("Android ");
        }

        stringBuilder.append("по ссылке");
        System.out.println(stringBuilder);
    }
    public static int calculateDeliveryDays (int distance) {
        if (distance < 0 || distance > 100) {
            return 0;
        }
        int days = 1;
        if (distance >= 20) {
            days++;
        }
        if (distance >= 60) {
            days++;
        }
        return days;
    }
}