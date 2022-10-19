#include <bits/stdc++.h>

using namespace std;

#define int long long

#define mod 1000000007


int32_t main() {

#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif

	int n,target;
	cin>>n>>target;


	int arr[n];

	for(int i=0;i<n;i++){
		cin>>arr[i];
	}

	sort(arr,arr+n);

	int dp[target+1];

	memset(dp,0,sizeof(dp));

	dp[0] = 1;

	for(int i=1;i<=target;i++){
		for(int j=0;j<n;j++){
			if(i-arr[j]>=0){
				dp[i]+=dp[i-arr[j]];
				dp[i] %= mod;
			}
		}
	}

	cout<<dp[target]<<endl;

}