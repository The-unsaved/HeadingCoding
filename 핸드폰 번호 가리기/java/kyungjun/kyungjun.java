class Solution {
    public String solution(String phone_number){ // 파라미터로 phone_number 받기
        int size = phone_number.length() - 4; // 핸드폰번호의 전체 번호 길이 - 4 =  뒤 4자리
        String temp = phone_number.substring(call); // 뒤 4자리를 temp 변수 에 넣음
        String answer = ""; // 정답을 받을 변수
        for(int i = 0; i < size; i++){ // 뒤 4자리를 제외한 자리 만큼 별을 삽입
            answer += "*";
        }
        return answer + temp; // 별 + 뒷자리 반환
    }
}