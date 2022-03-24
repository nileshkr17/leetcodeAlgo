class Solution {
    public:
        int romanToInt(string s) {
            int mp[26];
           int num=0,prev=-1;
           mp['M'-'A']=1000;
           mp['D'-'A']=500;
           mp['C'-'A']=100;
           mp['L'-'A']=50;
           mp['X'-'A']=10;
           mp['V'-'A']=5;
           mp['I'-'A']=1;
           for(int i=s.length()-1;i>=0;i--){
               if(mp[s[i]-'A']>=prev)num+=mp[s[i]-'A'];
               else num-=mp[s[i]-'A'];
               prev=mp[s[i]-'A'];
           }
           return num;
            
        }
    };