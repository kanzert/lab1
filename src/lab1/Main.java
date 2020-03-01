package lab1;

public class Main {
    //O1 = +
    //O2 = *
    // i, j - short
    //

    public static double computeFunction(int n, int m) {

        final short C = 0;
        double s = 0;

        for(short i = 0; i <= n; i++) {

            for(short j = 0; j <= m; j++) {
                try {
                    s += (i * j) / (i + C);
                } catch (ArithmeticException e) {
                    i++;
                }
                System.out.println(j);


            }
        }

        return s;
    }




    public static void main(String[] args) {
	// write your code here
        short n = 5;
        short m = 5;
        System.out.println(computeFunction(n, m));
    }
}
