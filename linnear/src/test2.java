public class test{
    public boolean isPalindrome(int number) {
        number = 2332;
        int reversedNumber = 0;
        while (number > 0) {

            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;

            if (reversedNumber == number) { // odd number of digits
                return true;
            }

            number /= 10;

            if (reversedNumber == number) { // even number of digits
                return true;
            }
        }

        return false;
    }
}
