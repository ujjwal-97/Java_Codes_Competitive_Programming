import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class subsequence{
    public static int long_inc_sub(int []arr, int n){
        int [] lis = new int[n];
        for(int i=0; i<n;i++){
            lis[i] =1;
        }
        for(int i=1; i<n;i++)
            for(int j=0; j<i;j++)
                if(arr[i]>arr[j] && lis[i]<lis[j]+1)
                    lis[i] =lis[j]+1;
        int max_value= Arrays.stream(lis).max().getAsInt();
        return max_value;
    }
    public static void main(String []args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(in.readLine());
        while(testcases -->0){
            int n =Integer.parseInt(in.readLine());
            int [] arr = new int[n];
            StringTokenizer st = new StringTokenizer(in.readLine());
            for(int i=0; i<n;i++){
                arr[i] =Integer.parseInt(st.nextToken());
            }
            int result = long_inc_sub(arr, n);
            System.out.println(result);
        }
    }
}