public static int solution(long num){

    for(int i=0; i < 500; i++) { // 문제에서 반복문(작업)을 500번 반복해도 1이 되지 않으면 -1을 리턴해야하므로 반복문을 500만큼 돌립니다.
        if(num == 1){
            return i; // num 이 1이 되면 모든 작업을 수행한 것이기 때문에 그동안 반복한 수(작업한 수)를 반환합니다
        }
        if (num % 2 == 0) { // 문제 1-1
            num /= 2;
        } else { // 문제 1-2
            num = (num * 3)+1;
        }
    }
    return -1; // 모든 작업을 수행해도(500번을 수행해도) 1이 되지 않으면 반복문을 빠져나오고 -1을 리턴
}