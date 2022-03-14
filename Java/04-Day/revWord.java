class Solution {
    public String reverseWords(String s) {
        char rev[] = s.toCharArray();
        int i=0;
        for(int j = 0;j < rev.length;j++)
        {
            if(rev[j] == ' '){
                revs(rev,i,j-1);
                i=j+1;
                
                
            }
            
            
            
                
            
        }
        revs(rev,i,rev.length-1);
            
        return new String (rev);
        
        
    }
    
    public void revs(char []rev,int i,int j)
    {
        while(i<=j)
        {
            char t = rev[i];
            rev[i] = rev[j];
            rev[j] = t;
            i++;
            j--;
        }
    }
}