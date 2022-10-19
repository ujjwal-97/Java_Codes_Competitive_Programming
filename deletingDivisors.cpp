#include <bits/stdc++.h>

using namespace std;

#define ll long long int



int main() {

#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif

	int t;
	cin >> t;


	while(t--){
		ll n;
		cin>>n;

		ll p = n;
		int k=0;

		while(p){
			p = p/2;
			k++;
		}
		k--;

		if(pow(2,k) == n && n%2==0){
			if(k%2){
				cout<<"Bob"<<endl;
			}else{
				cout<<"Alice"<<endl;
			}
		}else{
			if(n%2){
				cout<<"Bob"<<endl;
			}else{
				cout<<"Alice"<<endl;
			}
		}

	}

	


	

	return 0;
}