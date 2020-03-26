import java.util.*;
class number1{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String [] str1 = in.nextLine().split(",");
        int  n = str1.length;
        
        int [] arr= new int [n];
        
       for(int i=0; i<n;i++){
            arr[i]=Integer.parseInt(str1[i]);
        }
         int val = 0;
         for(int i=0; i< n;i++){
             val += arr[i];
         }
         for(int i=0; i< n;i++){
            System.out.print(val-arr[i]);
            if(i != n -1){
                System.out.print(",");
            }
        }
        
    }
}