class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = 0;
        int temp = n;

        while (temp > 0) {
            int a = temp % 10;
            rev = rev * 10 + a;
            temp /= 10;
        }

        int start = Math.min(n, rev);
        int end = Math.max(n, rev);

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}