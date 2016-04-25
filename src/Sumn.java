public class Sumn {
    private double n;

    public void setN(double n) {
        this.n = n;
    }
    public int getSumn() {
        int sum = 0;
        String s = Double.toString(n);
        char[] chArray = s.toCharArray();
        for (int i = 0; i<chArray.length; i++) {
            if (chArray[i] != '.') {
                sum = sum + Character.digit(chArray[i],10);
            }
        }
        return sum;

    }
}
