public static boolean solution(int x) {
    boolean answer = true; // 정답을 넣을 변수 선언
    int length = (int)(Math.log10(x)+1), temp = x, sum = 0; // int의 길이를 받을 length 선언, x를 담을 temp, 합을 담을 sum 선언
    int[] result = new int[length]; // 자릿수의 합을 넣을 result 배열 선언

    for(int i = 0; i < length; i++){ // 자릿수만큼 반복하는 for문
        result[i] = temp % 10; // 한자리 한자리씩 배열에 값 삽입
        temp = temp / 10; // 10으로 나누어 한자리씩 나눔
        sum = sum + result[i]; // result의 합을 배열에 삽입
    }
    if(x % sum == 0){ // x % sum 이 0이라면 (정수라면)
        answer = true; // answer 에 true 삽입
    }else{
        answer = false; // naswer 에 false 삽입
    }

    return answer; // answer 반환
}