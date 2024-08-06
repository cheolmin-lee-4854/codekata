public class reverseNumber{
    public int[] solution(int n) {
        int number = n; // 입력값을 보존하기 위한 변수명 변경
        int count = 0;
        int buffer = 0;
        
        while (true) {
            if (number < 1) {
                break;
            }
            number = number / 10;
            count++;
        }
        
        number = n; // 다시 원래 값으로 초기화
        
        int[] answer = new int[count]; 
        
        for (int i = 0; i < count; i++) {
            buffer = number % 10;
            answer[i] = buffer;
            number = number / 10;
        }
    
        return answer;
    }
}