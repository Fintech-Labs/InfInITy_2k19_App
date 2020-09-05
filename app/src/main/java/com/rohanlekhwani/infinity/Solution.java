package com.rohanlekhwani.infinity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Solution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solution_layout);
        Intent n=getIntent();
        int index=n.getIntExtra("tk.kunalgohire.Solution",-1);
        TextView solution=(TextView)findViewById(R.id.SolutionText);
		solution.setMovementMethod(new ScrollingMovementMethod());
        Spanned skip_it_sol= Html.fromHtml(
                "#include< bits/stdc++.h >"+"<br/>"+
                "#define ll long long int"+"<br/>"+
                "#define ld long double"+"<br/>"+
                "#define boost ios::sync_with_stdio(false); cin.tie(0)"+"<br/>"+
                "using namespace std;"+"<br/>"+
                "int main()"+"<br/>"+
               "{" +"<br/>"+
				"&nbsp;&nbsp;"+"boost;"+"<br/>"+
	            "&nbsp;&nbsp;  ll t,n,q,k,i,j,z;"+"<br/>"+
	            "&nbsp;&nbsp;  cin >> t;"+"<br/>"+
	            "&nbsp;&nbsp;  while(t--)"+"<br/>"+
	            "&nbsp;&nbsp;  {"+"<br/>"+
	            "&nbsp;&nbsp;&nbsp;&nbsp;   cin>>n>>q;"+"<br/>"+
		        "&nbsp;&nbsp; &nbsp;&nbsp;    ll arr[n];"+"<br/>"+
		        "&nbsp;&nbsp;&nbsp;&nbsp;     for(i=0;i < n;i++)"+"<br/>"+
		        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;        cin>>arr[i];"+"<br/>"+
		        "&nbsp;&nbsp;&nbsp;&nbsp;     ll sum[n];"+"<br/>"+
		        "&nbsp;&nbsp;&nbsp;&nbsp;     for(i=0;i < n;i++)"+"<br/>"+
		        "&nbsp;&nbsp;&nbsp;&nbsp;     {"+"<br/>"+
			    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;        sum[i]=0;"+"<br/>"+
			    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;        for(j=0;j < n;j+=i+1))"+"<br/>"+
			    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;           sum[i]+=arr[j];"+"<br/>"+
		        "&nbsp;&nbsp;&nbsp;&nbsp;     }"+"<br/>"+
		        "&nbsp;&nbsp;&nbsp;&nbsp;     while(q--)"+"<br/>"+
		        "&nbsp;&nbsp;&nbsp;&nbsp;     {"+"<br/>"+
			    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;        cin>>k;"+"<br/>"+
			    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;        cout << sum[k] << endl;"+"<br/>"+
		        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
	            "&nbsp;&nbsp;  }"+"<br/>"+
                "}"+"<br/>"+"<br/>"
);
		Spanned distrubute_sol=Html.fromHtml(
				"#include< bits/stdc++.h >"+"<br/>"+
				"#define ll long long int"+"<br/>"+
                "#define ld long double"+"<br/>"+
                "#define f first"+"<br/>"+
                "#define s second"+"<br/>"+
                "#define boost ios::sync_with_stdio(false); cin.tie(0)"+"<br/>"+
                "using namespace std;"+"<br/>"+
                "const ll MAX=1e5+5;"+"<br/>"+
                "ll arr[MAX],i,n,l,r,x,j,z;"+"<br/>"+
                "pair <ll,ll> tree[2*MAX];"+"<br/>"+
                "pair <ll,ll> aux,p,p1;"+"<br/>"+
                "void build()"+"<br/>"+
                "{"+"<br/>"+
                	"&nbsp;&nbsp;for(i=0;i < n;i++)"+"<br/>"+
	                "&nbsp;&nbsp;{"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;tree[n+i].f=arr[i];"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;tree[n+i].s=i+1;"+"<br/>"+
	                "&nbsp;&nbsp;}"+"<br/>"+
	                "&nbsp;&nbsp;for(i=n-1;i >0;i--)"+"<br/>"+
	                "&nbsp;&nbsp;{"+"<br/>"+
	                    "&nbsp;&nbsp;&nbsp;&nbsp;if(tree[2*i].f>tree[2*i+1].f)"+"<br/>"+
	                    "&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
	                    	"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tree[i].f=tree[2*i].f;"+"<br/>"+
	    	                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tree[i].s=tree[2*i].s;"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;else"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
			                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tree[i].f=tree[2*i+1].f;"+"<br/>"+
			                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tree[i].s=tree[2*i+1].s;"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
	                "&nbsp;&nbsp;}"+"<br/>"+
                "}"+"<br/>"+
                "void update(ll ind, ll x)"+"<br/>"+
                "{"+"<br/>"+
                	"&nbsp;&nbsp;ind --;"+"<br/>"+
	                "&nbsp;&nbsp;for(tree[ind+=n].f=x;ind>1;ind>>=1)"+"<br/>"+
	                "&nbsp;&nbsp;{"+"<br/>"+
						"&nbsp;&nbsp;&nbsp;&nbsp;if (tree[ind].f>tree[ind^1].f)"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
							"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tree[ind>>1].f=tree[ind].f;"+"<br/>"+
							"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tree[ind>>1].s=tree[ind].s;"+"<br/>"+
						"&nbsp;&nbsp;&nbsp;&nbsp;}" +"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;else"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;{"	+"<br/>"+
							"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tree[ind>>1].f=tree[ind^1].f;"+"<br/>"+
							"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tree[ind>>1].s=tree[ind^1].s;"+"<br/>"+
						"&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
					"&nbsp;&nbsp;}"+"<br/>"+
                "}"+"<br/>"+
                "pair < ll,ll > query(ll l, ll r)"+"<br/>"+
                "{"+"<br/>"+
	                "&nbsp;&nbsp;ll res=0,ind=-1;"+"<br/>"+
	                "&nbsp;&nbsp;l --;"+"<br/>"+
	                "&nbsp;&nbsp;for(l+=n,r+=n;l<r;l>>=1,r>>=1)"+"<br/>"+
	                "&nbsp;&nbsp;{"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;if(l&1)"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
		                	"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(tree[l++].f>res)"+"<br/>"+
		                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
		                    	"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;res=tree[l-1].f;"+"<br/>"+
		    	                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ind=tree[l-1].s;"+"<br/>"+
			                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;if(r&1)"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
		                	"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(tree[--r].f>res)"+"<br/>"+
			                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
				                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;res=tree[r].f;"+"<br/>"+
				                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ind=tree[r].s;"+"<br/>"+
			                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
	                "&nbsp;&nbsp;}"+"<br/>"+
	                "&nbsp;&nbsp;aux=make_pair(res,ind);"+"<br/>"+
                    "&nbsp;&nbsp;return aux;"+"<br/>"+
                "}"+"<br/>"+
                "void solve(ll j,ll x)"+"<br/>"+
		        "{"+"<br/>"+
		        	"&nbsp;&nbsp;ll res,diff;"+"<br/>"+
	                "&nbsp;&nbsp;l=max((ll)1,j-x);"+"<br/>"+
	                "&nbsp;&nbsp;r=min(n,j+x);"+"<br/>"+
	                "&nbsp;&nbsp;p=query(l,r);"+"<br/>"+
	                "&nbsp;&nbsp;update(p.s,0);"+"<br/>"+
	                "&nbsp;&nbsp;p1=query(l,r);"+"<br/>"+
	                "&nbsp;&nbsp;if(p.f!=arr[j-1]&&p.f!=p1.f)"+"<br/>"+
	                "&nbsp;&nbsp;{"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;x=p.s;"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;res=p.f;"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;diff=(res-arr[j-1]) / 3;"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;arr[j-1]+=diff;"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;arr[x-1]-=diff;"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;update(x,arr[x-1]);"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;update(j,arr[j-1]);"+"<br/>"+
	                "&nbsp;&nbsp;}"+"<br/>"+
	                "&nbsp;&nbsp;else"+"<br/>"+
	                "&nbsp;&nbsp;{"+"<br/>"+
		                "&nbsp;&nbsp;&nbsp;&nbsp;update(p.s,p.f);"+"<br/>"+
	                "&nbsp;&nbsp;}"+"<br/>"+
                "}"+"<br/>"+
                "int main()"+"<br/>"+
                "{"+"<br/>"+
                	"&nbsp;&nbsp;boost;"+"<br/>"+
                	"&nbsp;&nbsp;cin>>n;"+"<br/>"+
	                "&nbsp;&nbsp;ll sc[n];"+"<br/>"+
	                "&nbsp;&nbsp;for(i=0;i < n;i++)"+"<br/>"+
	                    "&nbsp;&nbsp;&nbsp;&nbsp;cin>>arr[i];"+"<br/>"+
	                "&nbsp;&nbsp;build();"+"<br/>"+
                    "&nbsp;&nbsp;for(i=0;i < n;i++)"+"<br/>"+
                    "&nbsp;&nbsp;&nbsp;&nbsp;cin>>sc[i];"+"<br/>"+
	                "&nbsp;&nbsp;for(i=0;i < n;i++)"+"<br/>"+
	                    "&nbsp;&nbsp;&nbsp;&nbsp;solve(i+1,sc[i]);"+"<br/>"+
	                "&nbsp;&nbsp;for(i=0;i < n;i++)"+"<br/>"+
	                    "&nbsp;&nbsp;&nbsp;&nbsp;cout << arr[i] ;"+"<br/>"+
	                "&nbsp;&nbsp;cout << endl;"+"<br/>"+
                "}"+"<br/>"+"<br/>"
);
		Spanned pari_n_prime=Html.fromHtml(
				"#include < bits/stdc++.h >"+"<br/>"+
                "#define ll long long int"+"<br/>"+
                "#define ld long double"+"<br/>"+
                "#define boost   "  + " &#8725;"+"<br/>"+
                "ios::sync_with_stdio(false); &#8725; "+"<br/>"+
                "cin.tie(0)"+"<br/>"+
                "#define mod 1000000007"+"<br/>"+
"using namespace std;"+"<br/>"+
"ll const MAX = 1e6 + 1;"+"<br/>"+
"int main()"+"<br/>"+
"{"+"<br/>"+
   "&nbsp;&nbsp;boost;"+"<br/>"+
    "&nbsp;&nbsp;ll t, n, m, i,j,ans;"+"<br/>"+
    "&nbsp;&nbsp;ll fact[MAX];"+"<br/>"+
    "&nbsp;&nbsp;bool prime[MAX];"+"<br/>"+
    "&nbsp;&nbsp;for (i=0;i< =MAX;i++)"+"<br/>"+
    "&nbsp;&nbsp;{"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;fact[i]=0;"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;prime[i]=true;"+"<br/>"+
    "&nbsp;&nbsp;}"+"<br/>"+
    "&nbsp;&nbsp;for (i=2;i< =MAX;i++)"+"<br/>"+
    "&nbsp;&nbsp;{"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;if (prime[i])"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fact[i]=i;"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for (j=i*2;j< =MAX;j=j+i)"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
               "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;prime[j]=false;"+"<br/>"+
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fact[j]=(fact[j]+i)%mod;"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
    "&nbsp;&nbsp;}"+"<br/>"+
    "&nbsp;&nbsp;cin >> t;"+"<br/>"+
    "&nbsp;&nbsp;while (t --)"+"<br/>"+
    "&nbsp;&nbsp;{"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;ans=0;"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;cin>>n>>m;"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;for (i=n;i< =m;i++)"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ans=(ans+fact[i])%mod;"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;cout<< ans << endl ;"+"<br/>"+
     "&nbsp;&nbsp;}"+"<br/>"+
"}"+"<br/>"+"<br/>");
		Spanned simple_series_sol=Html.fromHtml(
				"#include < bits/stdc++.h >"+"<br/>"+
"#define ll long long int"+"<br/>"+
"#define ld long double"+"<br/>"+
"#define mod 1000000007"+"<br/>"+
"#define boost           &#8725;"+"<br/>"+
		"ios::sync_with_stdio(false); &#8725;"+"<br/>"+
		"cin.tie(0)"+"<br/>"+
		"using namespace std;"+"<br/>"+
		"ll modexpo(ll x, ll y, ll p)"+"<br/>"+
		"{"+"<br/>"+
			"&nbsp;&nbsp;ll res = 1;"+"<br/>"+
			"&nbsp;&nbsp;x = x % p;"+"<br/>"+
			"&nbsp;&nbsp;while (y > 0)"+"<br/>"+
			"&nbsp;&nbsp;{"+"<br/>"+
				"&nbsp;&nbsp;&nbsp;&nbsp;if (y & 1)"+"<br/>"+
					"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;res=(res*x)%p;"+"<br/>"+
				"&nbsp;&nbsp;&nbsp;&nbsp;y>>=1;"+"<br/>"+
				"&nbsp;&nbsp;&nbsp;&nbsp;x=(x*x)%p;"+"<br/>"+
			"&nbsp;&nbsp;}"+"<br/>"+
			"&nbsp;&nbsp;return res;"+"<br/>"+
		"}"+"<br/>"+
		"int main()"+"<br/>"+
		"{"+"<br/>"+
			"&nbsp;&nbsp;boost;"+"<br/>"+
			"&nbsp;&nbsp;ll l,r,i,q,x;"+"<br/>"+
			"&nbsp;&nbsp;ll is_seq[100001];"+"<br/>"+
			"&nbsp;&nbsp;memset(is_seq,0,sizeof(is_seq));"+"<br/>"+
			"&nbsp;&nbsp;i=1;"+"<br/>"+
			"&nbsp;&nbsp;while (3*i+ 2< =100000)"+"<br/>"+
			"&nbsp;&nbsp;{"+"<br/>"+
				"&nbsp;&nbsp;&nbsp;&nbsp;is_seq[3*i+2]=1;"+"<br/>"+
				"&nbsp;&nbsp;&nbsp;&nbsp;i++;"+"<br/>"+
			"&nbsp;&nbsp;}"+"<br/>"+
			"&nbsp;&nbsp;ll sum[100001];"+"<br/>"+
			"&nbsp;&nbsp;sum[0]=0;"+"<br/>"+
			"&nbsp;&nbsp;for (i=1; i<100001;i++)"+"<br/>"+
			"&nbsp;&nbsp;{"+"<br/>"+
				"&nbsp;&nbsp;&nbsp;&nbsp;if(is_seq[i])"+"<br/>"+
					"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;sum[i]=(sum[i-1]+modexpo(i,i,mod))%mod;"+"<br/>"+
				"&nbsp;&nbsp;&nbsp;&nbsp;else"+"<br/>"+
					"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;sum[i]=sum[i-1];"+"<br/>"+
			"&nbsp;&nbsp;}"+"<br/>"+
			"&nbsp;&nbsp;cin >> q;"+"<br/>"+
			"&nbsp;&nbsp;while(q--)"+"<br/>"+
			"&nbsp;&nbsp;{"+"<br/>"+
				"&nbsp;&nbsp;&nbsp;&nbsp;cin>>l>>r;"+"<br/>"+
				"&nbsp;&nbsp;&nbsp;&nbsp;x=(sum[r]-sum[l-1]+mod)%mod;"+"<br/>"+
				"&nbsp;&nbsp;&nbsp;&nbsp;cout << x << endl;"+"<br/>"+
			"&nbsp;&nbsp;}"+"<br/>"+
		"}"+"<br/>"+"<br/>"
);
		Spanned ego_stone_sol=Html.fromHtml("#include< iostream >" +"<br/>"+
"using namespace std;"+"<br/>"+
"int main()" +"<br/>"+
		"{"+"<br/>"+
	"&nbsp;&nbsp;unsigned long long int t,n,c;"+"<br/>"+
	"&nbsp;&nbsp;cin>>t;"+"<br/>"+
	"&nbsp;&nbsp;while(t --)"+"<br/>"+
		"&nbsp;&nbsp;{"+"<br/>"+
		"&nbsp;&nbsp;&nbsp;&nbsp;cin >> n;"+"<br/>"+
		"&nbsp;&nbsp;&nbsp;&nbsp;c =(n*n*n+n)/ 2;"+"<br/>"+
		"&nbsp;&nbsp;&nbsp;&nbsp;cout << c << endl;"+"<br/>"+
	"&nbsp;&nbsp;}"+"<br/>"+
"}"+"<br/>"+"<br/>");

		Spanned bahubali_sol=Html.fromHtml(
				"#include < bits/stdc++.h >"+"<br/>"+
"using namespace std;"+"<br/>"+
"int main()"+"<br/>"+
		"{"+"<br/>"+
	"&nbsp;&nbsp;int n,  even = 0,odd = 0,a,i;"+"<br/>"+
	"&nbsp;&nbsp;cin >> n;"+"<br/>"+
	"&nbsp;&nbsp;for(i=0;i < n;++i)"+"<br/>"+
	"&nbsp;&nbsp;{"+"<br/>"+
	    "&nbsp;&nbsp;&nbsp;&nbsp;cin >> a;"+"<br/>"+
	    "&nbsp;&nbsp;&nbsp;&nbsp;if(a % 2)"+"<br/>"+
	    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;++ odd;"+"<br/>"+
	    "&nbsp;&nbsp;&nbsp;&nbsp;else"+"<br/>"+
	    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;++ even;"+"<br/>"+
	"&nbsp;&nbsp;}"+"<br/>"+
	"&nbsp;&nbsp;if(even > odd)"+"<br/>"+
	  "&nbsp;&nbsp;&nbsp;&nbsp;cout << &ldquo;READY FOR BATTLE&rdquo; ;"+"<br/>"+
	"&nbsp;&nbsp;else"+"<br/>"+
	"&nbsp;&nbsp;&nbsp;&nbsp;cout << &ldquo;NOT READY&rdquo; ;"+"<br/>"+
	"return 0;"+"<br/>"+
"}"+"<br/>"+"<br/>"
);
		Spanned why_five_sol=Html.fromHtml(
				"#include < bits/stdc++.h >"+"<br/>"+
"using namespace std;"+"<br/>"+
"int main() " +"<br/>"+
						"{"+"<br/>"+
	"&nbsp;&nbsp;int x,in;"+"<br/>"+
	"&nbsp;&nbsp;cin >> x >> in;"+"<br/>"+
	"&nbsp;&nbsp;if(in-x-5> =0 && x%5==0)"+"<br/>"+
	"&nbsp;&nbsp;&nbsp;&nbsp;cout<< in-x-5;"+"<br/>"+
	"&nbsp;&nbsp;else"+"<br/>"+
	"&nbsp;&nbsp;&nbsp;&nbsp;cout << in;"+"<br/>"+
"}"+"<br/>"+"<br/>"
);
		Spanned triangle_trouble_sol=Html.fromHtml(
				"#include < bits/stdc++.h >"+"<br/>"+
"using namespace std;"+"<br/>"+
"int main() " +"<br/>"+
		"{"+"<br/>"+
	"&nbsp;&nbsp;int n,cnt=1,i,k,j;"+"<br/>"+
	"&nbsp;&nbsp;long long term;"+"<br/>"+
	"&nbsp;&nbsp;cin >> n;"+"<br/>"+
	"&nbsp;&nbsp;for(i=1;j< =n;++i)"+"<br/>"+
	 "&nbsp;&nbsp;{" +"<br/>"+
	 	"&nbsp;&nbsp;&nbsp;&nbsp;for(j=1;j< =i;++j)"+"<br/>"+
	    "&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
	         "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;term=(8*cnt*cnt)-1;"+"<br/>"+
	         "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(log10(term)+1 < 5)"+"<br/>"+
	         "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{" +"<br/>"+
	             "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for(k=0;k< 4-log10(term);k++)"+"<br/>"+
	             "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cout << 0;"+"<br/>"+
	         "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
	         "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cout << term ;"+"<br/>"+
	         "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cnt++;"+"<br/>"+
	    "&nbsp;&nbsp;&nbsp;&nbsp;}" +"<br/>"+
	    "&nbsp;&nbsp;&nbsp;&nbsp;cout << endl;"+"<br/>"+
	    "&nbsp;&nbsp;}"+"<br/>"+
	"&nbsp;&nbsp;return 0;"+"<br/>"+
"}"+"<br/>"+"<br/>"
);
		Spanned love_all_sol=Html.fromHtml("#include < bits/stdc++.h >"+"<br/>"+
"using namespace std;"+"<br/>"+
"int main()"+"<br/>"+
	"{"+"<br/>"+
		"&nbsp;&nbsp;int tc;"+"<br/>"+
    "&nbsp;&nbsp;cin >> tc;"+"<br/>"+
    "&nbsp;&nbsp;while(tc --)"+"<br/>"+
	"&nbsp;&nbsp;{"+"<br/>"+
	"&nbsp;&nbsp;&nbsp;&nbsp;int cost[26],ch[26]={0},i;"+"<br/>"+
	"&nbsp;&nbsp;&nbsp;&nbsp;long long c = 0;"+"<br/>"+
	"&nbsp;&nbsp;&nbsp;&nbsp;string s ;"+"<br/>"+
	"&nbsp;&nbsp;&nbsp;&nbsp;for(i=0;i< 26;++i)"+"<br/>"+
	    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cin >> cost[i];"+"<br/>"+
	"&nbsp;&nbsp;&nbsp;&nbsp;cin >> s;"+"<br/>"+
	"&nbsp;&nbsp;&nbsp;&nbsp;for(i=0;i< s.size();++i)"+"<br/>"+
	   "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ch[s[i]-'a']++;"+"<br/>"+
	"&nbsp;&nbsp;&nbsp;&nbsp;for(i=0;i< 26;++i)"+"<br/>"+
	"&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
	   "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(ch[i]==0)"+"<br/>"+
	   "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;c+=cost[i];"+"<br/>"+
    "&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
    "&nbsp;&nbsp;&nbsp;&nbsp;cout << c << endl;"+"<br/>"+
    "&nbsp;&nbsp;}"+"<br/>"+
    "&nbsp;&nbsp;return 0;"+"<br/>"+
"}"+"<br/>"+"<br/>");
		Spanned cougth_you=Html.fromHtml("#include< iostream >"+"<br/>"+
"#include< string.h >"+"<br/>"+
"using namespace std;"+"<br/>"+
"int main()"+"<br/>"+
"{"+"<br/>"+
    "&nbsp;&nbsp;int t;"+"<br/>"+
    "&nbsp;&nbsp;cin >> t;"+"<br/>"+
    "&nbsp;&nbsp;while(t --)"+"<br/>"+
    "&nbsp;&nbsp;{"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;long int n,r,sum = 0;"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;cin >> n >> r;"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;long long int s[n],x[n],y[n],i,j;"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;for(i=0;i< n;i++)"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cin >> s[i];"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;sum+=s[i];"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;int flag=0;"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;if(n==1 && s[n-1]==r)"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cout<< &ldquo;YES&rdquo ;<<endl;"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;else if(n==1 && s[n - 1]!=r)"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cout<< &ldquo;NO&rdquo ;<<endl;"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;else if(sum> =1 && sum< =1.5*1000000)"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for(j=1; j< n-1;j++)"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
                 "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(s[j]< s[j-1])"+"<br/>"+
                 "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
                 	"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(s[j+1]> s[j-1])"+"<br/>"+
                 	"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;flag=1;"+"<br/>"+
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;break;"+"<br/>"+
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
                 "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
                 "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(s[j]> s[j-1])"+"<br/>"+
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
                	"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(s[j+1]< s[j-1])"+"<br/>"+
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{"+"<br/>"+
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;flag=1;"+"<br/>"+
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;break;"+"<br/>"+
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(flag==0)"+"<br/>"+
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cout<< &ldquo;YES&rdquo ; <<endl;"+"<br/>"+
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;else"+"<br/>"+
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cout<< &ldquo;NO&rdquo ; <<endl;"+"<br/>"+
        "&nbsp;&nbsp;&nbsp;&nbsp;}"+"<br/>"+
    "&nbsp;&nbsp;}"+"<br/>"+
    "&nbsp;&nbsp;return 0;"+"<br/>"+
"}"+"<br/>"+"<br/>"
);
		if(index==0)
		{
			solution.setText(bahubali_sol);
		}
		else  if(index==1)
		{
            solution.setText(why_five_sol);
		}
		else if(index==2)
		{
			solution.setText(triangle_trouble_sol);
		}
		else if(index==3)
		{
			solution.setText(love_all_sol);
		}
		else if(index==4)
		{
			solution.setText(cougth_you);
		}
        else if(index==5)
        {
             solution.setText(ego_stone_sol);
        }
        else if(index==6)
        {
            solution.setText(skip_it_sol);
        }
        else if (index==7)
		{
			solution.setText(pari_n_prime);
		}
        else if(index==8)
		{
			solution.setText(simple_series_sol);
		}
        else if (index==9)
		{
			solution.setText(distrubute_sol);
		}
    }
}