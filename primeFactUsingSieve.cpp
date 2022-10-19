#include <bits/stdc++.h>

using namespace std;

#define ll long long

ll MAX = 1e6;

vector<ll> sieve(MAX+1,-1);


int main() {

#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
#endif

	//sieve[0]=sieve[1]=0;
	for(int i=2;i*i<=MAX;i++){
		if(sieve[i] == -1){
			for(int j=i*i;j<=MAX;j+=i){
				sieve[j] = i;
			}
		}
	}

	int t;
	cin>>t;

	while(t--){
		int N;
		cin>>N;

		map<ll,ll> res;

		while(sieve[N] != -1){
			res[sieve[N]]++;
			N = N/sieve[N];
		}
		res[N]++;

		for(auto i:res){
			cout<<i.first<<" : "<<i.second<<endl;
		}
	}


return 0;
}