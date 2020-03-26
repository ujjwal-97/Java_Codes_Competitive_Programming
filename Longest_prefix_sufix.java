import java.util.*;
class longestprefixsufix{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        int n = str.length();
        int len = n/2;
        //System.out.println(str.substring(0, len));
        for(int i=0; i<len; i++){
            String str1 =str.substring(0, len-i);
            String str2 =str.substring(len +i,n);
            if(str1.length() != str2.length()){
                str2 =str.substring(len+1 +i,n);
            }
            if(str1.equals(str2)){
                System.out.println(str2.length());
                break;
            }
        }
    }
}