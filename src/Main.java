public class Main {
    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //return false;
        return false;
    }

    public static int selectClientOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        return clientOS;
    }

    public static boolean delivery(int deliveryDistance) {
        if (20 >= deliveryDistance) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        }
        return false;
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2022;
        isLeapYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        /* тип операционной системы
        iOS = 0;
        Android = 1;
        */
        int clientOS = 1;
        int clientDeviceYear = 2015;
        selectClientOS(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("Задача 3");

        int deliveryDistance = 80;

        delivery(deliveryDistance);
    }
}