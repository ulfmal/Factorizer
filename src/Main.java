import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");
    }

    BigInteger factor1;
    BigInteger factor2;
    BigInteger product;
    int step;

    public void run(BigInteger min, BigInteger max) {
        BigInteger number = min;
        while (number.compareTo(max) <= 0) {
            if (product.remainder(number).compareTo(BigInteger.ZERO) == 0) {
                factor1 = number;
                factor2 = product.divide(factor1);
                return;
            }
            number = number.add(BigInteger.valueOf(step));
        }
    }
}
