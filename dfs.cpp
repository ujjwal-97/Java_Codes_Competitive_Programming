#include <bits/stdc++.h>

using namespace std;

#define int long long

void dfs(vector<vector<int>>& adj, int & res, int cats, vector<int>& catsSeq, int  curr, int root, vector<bool> &vis) {
	vis[root] = true;
	if (root != 1 && adj[root].size() == 1 && curr <= cats) {
		//cout<<"root"<<root<<endl;
		res++;
		return;
	}
	for (int i : adj[root]) {
		if (!vis[i] && catsSeq[i] == 1 ) {
			if (curr + 1 <= cats) {
				dfs(adj, res, cats, catsSeq, curr + 1, i, vis);
			} else {
				continue;
			}
		}
		else if (!vis[i]) {
			dfs(adj, res, cats, catsSeq, 0, i, vis);
		}
	}
}


int32_t main() {

#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif
	int n, cats;
	cin >> n >> cats;
	vector<vector<int>> adj(n + 1, vector<int>());
	vector<int> catsSeq(n + 1);

	for (int i = 1; i < n + 1; i++) {
		cin >> catsSeq[i];
	}

	for (int i = 1; i < n; i++) {
		int a, b;
		cin >> a >> b;
		adj[a].push_back(b);
		adj[b].push_back(a);
	}
	// for(int i=0;i<adj.size();i++){
	// 	for(int j=0;j<adj[i].size();j++){
	// 		cout<<adj[i][j]<<" ";
	// 	}
	// 	cout<<endl;
	// }
	int res = 0;
	vector<bool> vis(n + 1, false);
	if (catsSeq[1] == 1)
		dfs(adj, res, cats, catsSeq, 1, 1, vis);
	else
		dfs(adj, res, cats, catsSeq, 0, 1, vis);

	cout << res << endl;




	return 0;
}