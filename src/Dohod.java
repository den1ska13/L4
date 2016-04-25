public class Dohod {
    private int i;

    public void setI(int i) {
        this.i = i;
    }

    public void raschet() {
        if (i > 0) {
            if (i <= 1000) {
                System.out.println("Критический доход");
            } else if (i<=5000) {
                System.out.println("Средний доход");
              }
                    else if (i<=100000) {
                System.out.println("Высокий доход");
            }
            else System.out.println("Миллионер");
        }
    }
}
