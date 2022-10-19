#include <bits/stdc++.h>

using namespace std;

#define int long long int
#define mod 100000007


int32_t main() {

#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif

	int A,B;
	cin>>A>>B;

	int dp[A][A];

	memset(dp,1,sizeof(dp));
	
	dp[A-1][A-1] = 1;

	
	for(int i=A-1;i>=0;i--){
		int j;
		if(i==A-1)
			j=A-2;
		else
			j=A-1;

		for(;j>=0;j--){
			if(i+j+B == 2*(A+1/2) || i+j-B == 2*((A+1)/2)){
				dp[i][j] = 0;
			}else if(i == A-1){
				dp[i][j] = dp[i][j+1];
			}else if(j == A-1){
				dp[i][j] = dp[i+1][j];
			}else{
				dp[i][j] = (dp[i][j+1] + dp[i+1][j])%mod;
			}
		}
	}

	cout<<dp[0][0]%mod<<endl;



return 0;
}