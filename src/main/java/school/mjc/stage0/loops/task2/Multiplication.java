package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        int negativeI = 0;
        if (multiplyByAndToInclusive > 0) {
            while (i <= multiplyByAndToInclusive) {
                System.out.println(i * multiplyByAndToInclusive);
                i++;
            }
        } else if (i == 0) {
        }else {
            while (i >= multiplyByAndToInclusive) {
                System.out.println(negativeI * multiplyByAndToInclusive);
                i--;
                negativeI ++;
            }
        }
    }
}
