package codewars_katas;

public class MultiplesOf3Or5 {

    public int solution(int number) {
        int sum = 0;
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum = sum + i;
                }
            }
            return sum;
        } else {
            return 0;
        }

    }
}