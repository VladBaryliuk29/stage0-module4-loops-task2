package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        boolean isPrime = true;
        int i = 2;
        int counter = 2;
        while (counter <= printToInclusive) {
            while (i < counter) {
                if (counter % i == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
                i++;
            }
            if (isPrime == true) {
                System.out.println(i);
            }
            counter++;
            i = 2;
        }
    }
}
