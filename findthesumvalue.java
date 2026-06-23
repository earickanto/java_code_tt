public class findthesumvalue {
    public static void main(String[] args){
        int[] arr={2,7,11,15};
        for(int i=0; i < arr.length;i++){
            int key = 9;
            for(int j=0; j<i;j++){
                int sum = arr[i] + arr[j];
                if(sum == key){
                    System.out.println("the value "+ arr[i] +" and " + arr[j] + " are : " + sum);
                }
            }
        }
    }
}
