import java.util.*;
import java.lang.*;
class file1{
    
    public static String reverseStr(String str){
        StringBuilder str1 =new StringBuilder(str);
        StringBuilder str2 =str1.reverse();
        return str2.toString();
    }
    public static boolean check_self(String str){
        if(str.equals(reverseStr(str))){
            return true;
        }
        return false;
    }
    public static boolean
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int z =in.nextInt();
        in.nextLine();
        String [] strs =new String [n];
        for(int i=0; i<n;i++){
            strs[i] =in.nextLine();
            strs[i] = strs[i].substring(0,z)   ;
           // System.out.println(strs[i]);      
        }


    }
}