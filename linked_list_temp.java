import java.util.*;
class problem{
    public static int value;
    public static int function(String str){
        StringBuilder str2 = new StringBuilder(str); 
        if(str.isEmpty()){
            return 0;
        }

        char c =str2.charAt(0);
        str2.deleteCharAt(0);
        int x = c-'A'+1;
        if(str.length()>1){
            value =26*value +function(str2.toString());
        }
        else{

        }
        
        return x;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String str =in.nextLine();
        int x = function(str);
        System.out.println(x);
    }
}