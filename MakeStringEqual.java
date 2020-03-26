import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testcases = in.nextInt();
        int n1 ;
        int n2 ;
        String str1, str2;
        for(int i=0; i<testcases;i++){
            n1 =in.nextInt();
            n2 = in.nextInt();
            in.nextLine();
            str1 =in.nextLine();
            str2 =in.nextLine();
            boolean flag=true;
            if(n1 != n2){System.out.println("NO");}
            else{
                for(int j=0;j<n1;j++){
                    for(int k=j+1;k<n1;k++)
                    {
                        if(str1.charAt(j)==str1.charAt(k)){
                            if(str2.charAt(j) != str2.charAt(k))
                                flag = false;
                        }
                    }
                }
               // System.out.println(myList1);
               
                if (flag ==true){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}