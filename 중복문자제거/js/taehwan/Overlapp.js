function solution(s) {
    let answer;
    for (let i = 0; i < s.length; i++) {
        if (s.indexOf(s[i]) === i) { // 자기와 같은 문자의 첫번째 인덱스 값과 본연의 위치가 같은지 판별 
            answer += s[i];
        }
    }
    return answer;
}

console.log(solution('ksekkset'));