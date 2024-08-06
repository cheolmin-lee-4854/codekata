public class AddSurplus{
    public int solution(int n) {
        int answer = 0;
        int count = 1;
        
        while(true){
            if((n%count) == 1){
                answer = count;
                break;
            }
            count++;
        }
        return answer;
    }
}