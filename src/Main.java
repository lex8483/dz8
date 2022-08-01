import java.util.Scanner;

public class Main {

    public static int yarVis(int i) {
        if (i % 4 == 0 && i != 100 || i % 400 == 0) {
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
        return i;
    }

    public static void operatingSystem(int i, int j) {

        if (i == 0 && j >= 2015) {
            System.out.println("Установите приложения для iOS по ссылке");
        } else if (i == 0 && j < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (i == 1 && j >= 2015) {
            System.out.println("Установите приложения для Android по ссылке");
        } else if (i == 1 && j < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void delivery(int i, int j) {
        if (i >= 20 && i < 60) {
            j += 1;
            System.out.println("Потребуется дней: " + j);
        } else if (i >= 60 && i < 100) {
            j += 2;
            System.out.println("Потребуется дней: " + j);
        } else if (i >= 100) {
            j += 3;
            System.out.println("Потребуется дней: " + j + " и более");
        } else System.out.println("Потребуется дней: " + j);

    }

    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.print("Введите год - ");
        int years = sw.nextInt();
        yarVis(years);
        System.out.println("----------------------------------------");
        int iOS = 0;
        int Android = 1;
        Scanner qw = new Scanner(System.in);
        System.out.print("Введите ОС: iOS - 0, Android - 1: ");
        if (iOS == qw.nextInt()) {
            operatingSystem(iOS, years);
        } else operatingSystem(Android, years);
        System.out.println("----------------------------------------");
        Scanner rw = new Scanner(System.in);
        int i = 1;
        System.out.print("Доставка в пределах скольки км ");
        int deliveryDistance = rw.nextInt();
        delivery(deliveryDistance, i);


    }


}
