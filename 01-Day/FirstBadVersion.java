public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = -1;
        int j = n;
        while(j - i > 1){
            int mid = i + (j - i) / 2;
            boolean isBad = isBadVersion(mid);
            if(isBad){
                j = mid;
            } else {
                i = mid;
            }
        }
        return isBadVersion(i) ? i : j;
    }
}