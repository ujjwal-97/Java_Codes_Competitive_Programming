import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stringalgo {
    public static void main(String args[])throws IOException
    {
        BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
        String s=re.readLine();
        String p=re.readLine();
        int n=s.length();
        int m=p.length();
        int i,j;
        for( i=0;i<=n-m;i++)
        {
            for( j=0;j<m;j++)
            {
                if(s.charAt(i+j)!=p.charAt(j))

                    break;
                
            }
            if(j==m)
            {
                System.out.println(i);
            }
            
        }
    }
}