public class ArrayAvg{
    public double solution(double[] numbers) {
        double answer = 0;
        for (int i=0 ; i<numbers.length ; i++){
            answer = answer + numbers[i];
        }
        answer = answer / numbers.length;
        return answer;
    }
}