public class SumOfDigits {
    static void main(String[] args) {
        int x = 257;
        int sum = 0;
        while (x > 0) {
            int digit = x % 10;
            sum += digit;
            x = x / 10;


        }
        System.out.print(+sum);
    }

}