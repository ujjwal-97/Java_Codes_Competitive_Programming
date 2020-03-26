import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class longComSub{
    public static int function(String str1,String str2){
        int m = str1.length();
        int n = str2.length();
        int L[][] =new int[m+1][n+1];
        int  i,j;
        for(i=0;i<m+1;i++)
            for(j=0;j<n+1;j++){
                if(i==0 ||j==0)
                    L[i][j] =0;
                else if(str1.charAt(i-1) ==str2.charAt(j-1))
                    L[i][j] =L[i-1][j-1] +1;
                else{
                    L[i][j] =Math.max(L[i-1][j],L[i][j-1]);
                }
            }
        i=m;
        j=n;
        String result = "";
        while(i >0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                result +=str1.charAt(i-1);
                i--;
                j--;
            }
            else if(L[i-1][j]>L[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }
        StringBuilder common_string =new StringBuilder(result);
        common_string.reverse();
        System.out.println(common_string.toString());
        return L[m][n];
    }
    public static void main(String [] args) throws IOException{
        int x=5;
        x=10;
        System.out.println(x);
    }
}