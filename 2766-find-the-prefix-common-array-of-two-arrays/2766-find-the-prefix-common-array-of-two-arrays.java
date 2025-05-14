class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] ans = new int[n];
        Set<Integer> seena = new HashSet<>();
        Set<Integer> seenb = new HashSet<>();
        int cmmncnt = 0;

        for (int i=0;i<n;i++) {
            seena.add(A[i]);
            seenb.add(B[i]);
            if(seenb.contains(A[i])) cmmncnt++;
            if(A[i]!=B[i]&&seena.contains(B[i])) cmmncnt++;
            ans[i]=cmmncnt;
        }
        return ans;
    }
}
