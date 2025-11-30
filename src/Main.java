import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random2 = new Random();
        int year  = random2.nextInt(2025 - 1584) + 1584;
        //System.out.println(year);

        if (year < 1584) {
            System.out.println("Введённый год меньше 1584 года, когда был введён вискосный год");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " год является високосным \n");
        } else {
            System.out.println(year + " год не является високосным \n");
        }
    }
}