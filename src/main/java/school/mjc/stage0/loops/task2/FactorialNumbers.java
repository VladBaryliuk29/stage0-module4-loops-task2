package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int result = 1;
        int i = 1;
        int counter = 0;
        int smallCounter = 0;
        while (counter <= printToInclusive) {
            while (i <= smallCounter) {
                result *= i;
                i++;
            }
            System.out.println(result);
            counter++;
            result = 1;
            i = 1;
            smallCounter++;
        }
    }
}
