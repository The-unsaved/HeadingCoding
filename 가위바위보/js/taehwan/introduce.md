**A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.**

**가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.**

> 내가 작성한 코드

```javascript
function solution(a, b) {
    let answer = "";
    for (let i = 0; i < a.length; i++) {
        if (a[i] === b[i]) answer += "D" + " ";
        else if (a[i] === 1 && b[i] === 3) answer += "A" + " ";
        else if (a[i] === 2 && b[i] === 1) answer += "A" + " ";
        else if (a[i] === 3 && b[i] === 2) answer += "A" + " ";
        else answer += "B" + " ";
    }

    return answer;
}

let a = [2, 3, 3, 1, 3];
let b = [1, 1, 2, 2, 3];
console.log(solution(a, b));
```

1. `for` 문으로 비교해준다.
2. `A` 가 이길때만을 생각하고 비교한다.
3. `a[i]` 와 `b[i]` 가 같으면 `D` 를 출력한다.
4. `else if` 로 `A` 가 출력될때를 가정한다.
5. `else` 로 `B` 가 이길때를 가정한다.
6. `A B A B D` 가 출력된다.