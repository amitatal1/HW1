public class Assignment01Q02 {
    public static void main(String[] args) {

        int n = 0;
        n = Integer.parseInt(args[0]);

        double actualPi = Math.PI;
        double approxPi = 0.0;
        double sum = 0.0;
        int sign = 1;

        for (int i = 0; i < n; i++) {
            sum += sign * (1.0 / (2 * i + 1));
            sign *= -1;
        }

        approxPi = 4.0 * sum;
        System.out.println("Approximate PI: " + approxPi);
        System.out.println("Actual PI:      " + actualPi);
    }
}
