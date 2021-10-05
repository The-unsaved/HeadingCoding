public static String solution(String phone_number) {
        String[] answer = phone_number.split(""); // String인 phone_number를 배열로 변환
        for(int i = 0 ; i < phone_number.length()-4;i++){ //phone_number의 끝 4자리는 가리지 않아야 하므로 전체 길이에서 4를 빼고 반복문을 돌림
            answer[i] = "*"; // 4자리를 제외한 나머지를 *로 가림
        }
        return String.join("", answer); //배열로 변환했던 strArr를 리턴할 수 있도록 String으로 다시 변환함
}