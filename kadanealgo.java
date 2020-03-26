import java.util.*;
class kadanealgo{
    public static int maxsum(int[] n){
        int max_so_far=n[0];
        int max_ending_here =n[0];
        for(int i=1;i<n.length;i++){
            max_ending_here =Math.max(n[i], max_ending_here+ n[i]);
            
            max_so_far =Math.max(max_so_far,max_ending_here);
        }
        return max_so_far;

    }
    public static void main(String [] args){
       // Scanner in = new Scanner(System.in);
        int[] num =new int[] {12,-32,23,1,-5,7};
       // num [6]=
        int result = maxsum(num);
        System.out.printf("%d", result);
    }
}