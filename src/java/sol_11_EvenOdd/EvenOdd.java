public class EvenOdd{
    public String solution(int numbers) {
        String answer;
        if ((numbers % 2) == 0){
            answer = "Even";
        }
        else{
            answer = "Odd";
        }
        return answer;
    }
}