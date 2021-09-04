
function solution(s) {
    const HalfofString = s.length/2;
    return s.length % 2 == 0 ? s[HalfofString-1]+s[HalfofString] : s[Math.ceil(HalfofString)-1]
}
 