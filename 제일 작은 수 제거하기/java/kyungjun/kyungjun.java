import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public int[] solution(int[] arr) {
    int min = 2147483647;
    int minIdx = 0;
    if(arr.length == 1){
        arr[0] = -1;
        return arr;
    } else {
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]) {
                minIdx = i;
                min = arr[i];
            }
        }

        Integer integerArr[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> temp = new ArrayList<Integer>(Arrays.asList(integerArr));
        temp.remove(minIdx);
        return temp.stream().mapToInt(i -> i).toArray();
    }
}