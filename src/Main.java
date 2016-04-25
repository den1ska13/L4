import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1) Вывод строки");
        System.out.println("2) Сумма цифр вещественного числа");
        System.out.println("3) Ежемесячный доход");
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        switch (w) {
            case 1: {
                Print p1 = new Print();
                p1.Str();
                break;
            }
            case 2: {
                Sumn s1 = new Sumn();
                System.out.println("Введите вещественное число (с запятой)");
                s1.setN(sc.nextDouble());
                System.out.println(s1.getSumn());
                break;
            }
            case 3: {
                Dohod d1 = new Dohod();
                System.out.println("Ввидете свой ещемесячный доход");
                d1.setI(sc.nextInt());
                d1.raschet();
                break;
            }
            default: {
                System.out.println("Неправильный выбор");
            }
        }
    }
}
