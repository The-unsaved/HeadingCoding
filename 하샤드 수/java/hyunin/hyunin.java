public static boolean solution(int harshad){
        int number = 0;
        String[] strArr = Integer.toString(harshad).split("");
        for(String jas:strArr){
            number += Integer.parseInt(jas);
        }
        if(harshad%number==0){
            return true;
        }
    return false;
}