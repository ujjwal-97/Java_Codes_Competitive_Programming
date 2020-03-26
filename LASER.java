import java.util.*;
class laser{
    public static void checkintersection(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        System.out.println("Intersection check");
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        if(in.hasNextInt()){
            int testcases = in.nextInt();
            while(testcases-- >0){
                int n =in.nextInt();
                int q =in.nextInt();
                int []arr =new int[n];
                for(int i=0;i<n;i++){
                    arr[i] =in.nextInt();
                }
                int [][] query= new int[q][3];
                for(int i=0;i<q;i++){
                    for(int j=0; j<3;j++){
                        query[i][j] =in.nextInt();
                    }
                }
                for(int i=0;i<q;i++){
                    int y = query[i][2];
                    for(int k=0;k<n-1;k++){
                        if(arr[k]> y && arr[k+1] <y){
                            checkintersection(query[i][0],query[i][2],query[i][1],query[i][2],i+1,arr[k],i+2,arr[k+1]);
                        }
                        else if(arr[i]< y && arr[i+1] >y){
                            checkintersection(query[i][0],query[i][2],query[i][1],query[i][2],i+1,arr[k],i+2,arr[k+1]);
                        }
                    }
                }

            }

        }
    }
}