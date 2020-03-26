import java.util.*;
class otp{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder str1 = new StringBuilder();
        for(int i=0; i<str.length();i++){
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(num%2!=0){
                str1.append(Integer.toString(num*num));
            }
        }
        if(str1.length() >3){
            System.out.println(str1.substring(0,4));
        }
        else{
            System.out.println(-1);
        }
    }
}