import java.util.*;
class maxdiff{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        if(in.hasNextInt()){
            int testcase =in.nextInt();
            while(testcase-- >0){
                int n= in.nextInt();
                int k  = in.nextInt();
                int arr[] = new int [n];
                for(int i=0; i<n; i++){
                    arr[i] =in.nextInt();
                }
                Arrays.sort(arr);
                int count1 =0;
                int count2 =0;
                for(int i=0; i<k;i++){
                    count1 +=arr[i];
                }
                for(int i=k; i<n;i++){
                    count2 +=arr[i];
                }
                System.out.println(Math.abs(count1 -count2));
            }
        }
    }
}