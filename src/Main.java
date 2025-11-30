import java.util.Random;

public class Main {

    // method of case №1

    public static void checkYear(int year) {
        if (year < 1584) {
            System.out.println("Введённый год меньше 1584 года, когда был введён вискосный год");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным \n");
        } else {
            System.out.println(year + " год не является високосным \n");
        }
    }

    // method of case №2

    public static void checkOS(int checkClientOS, int productionDate) {
        int clientDeviceYear = 2015;
        if (checkClientOS > 0 && productionDate >= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке \n");
        } else if (checkClientOS > 0 && productionDate < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке \n");
        } else if (checkClientOS == 0 && productionDate >= clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке \n");
        } else if (checkClientOS == 0 && productionDate < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке \n");
        }
    }

    // method of case №3

    public static void checkDelivery(int distance){
        int deliveryTime = 0;
        if (distance < 20) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        } else if (distance < 60) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        } else if (distance < 100) {
            deliveryTime += 3;
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        } else {
            System.out.println("Доставки на такое расстояние нет \n");
        }
    }

    public static void main(String[] args) {

        //case №1

        Random random = new Random();
        int exampleOfYear  = random.nextInt(2025 - 1584) + 1584;
        checkYear(exampleOfYear);

        //case №2

        Random random0 = new Random();
        int ClientOS  = random.nextInt(2 - 0);

        Random random1 = new Random();
        int productionDate  = random.nextInt(2025 - 2012) + 2012;
        checkOS(ClientOS, productionDate);

        //case №3

        int deliveryDistance = 60;
        checkDelivery(deliveryDistance);

    }
}