public class smithNumber {
    static int calculateSumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;

            sum += digit;

            num /= 10;
        }

        return sum;
    }
    static int sumOfPrimeFactors(int num) {
        int sum = 0;
        if(num == 1 || num == 0) {
            return sum;
        }
        while (num % 2 == 0) {
            sum += 2;
            num /= 2;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                sum += calculateSumOfDigits(i);
                num /= i;
            }
        }

        if (num > 2) {
            sum += calculateSumOfDigits(num);
        }

        return sum;
    }
    static int smithNum(int n) {
        // code here
        if(calculateSumOfDigits(n) == sumOfPrimeFactors(n)) {
            return 1;
        }
        return 0;
    }

}
