public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание 1");
        var clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void task2() {
        System.out.println("Задание 2");
        var clientOS = 1;
        var clientDeviceYear = 2009;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        var year = 2021;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    public static void task4() {
        System.out.println("Задача 4");
        var deliveryDistance = 40;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет 1 день");
        } else if (deliveryDistance <= 60 && deliveryDistance > 21) {
            System.out.println("Доставка займет 2 дня");
        } else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            System.out.println("Доставка займет 3 дня");
        } else System.out.println("Доставки нет");

    }

    public static void task5() {
        System.out.println("Задача 5");
        var monthNumber = 12;
        switch (monthNumber) {
            case 11:
            case 12:
            case 1:
                System.out.println("Зимний сезон");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Весенний сезон");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Летний сезон");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Осенний сезон");
                break;
            default:
                System.out.println("Введено неверное значение");
        }
    }
}