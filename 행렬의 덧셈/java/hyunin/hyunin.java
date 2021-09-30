public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        System.out.println(arr1.length +"\n"+ arr1[0].length);
        answer = arr1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }