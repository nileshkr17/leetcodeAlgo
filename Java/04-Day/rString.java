class Solution{
    public void rString(char[] s)
    {
        int len = s.length;
        char temp;
        for(int i = 0; i<len/2; ++i)
        {
            temp=s[i];
            s[i]=s[len-i-1];
            s[len-i-1]=temp;

        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);   
        }
       
    }

    
}