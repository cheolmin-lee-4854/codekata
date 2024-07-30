class Operation{
    public int Angle_Identification(int angle) {
        int answer;
        if (angle > 0 && angle <90){
            answer = 1;
        }
        else if (angle == 90){
            answer = 2;
        }
        else if (angle > 90 && angle < 180){
            answer = 3;
        }
        else if (angle == 180){
            answer = 4;
        }
        else{
            answer = 5;
        }

        return answer;
    }
}