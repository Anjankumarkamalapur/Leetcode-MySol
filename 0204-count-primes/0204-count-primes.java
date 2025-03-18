class Solution {
    public int countPrimes(int n) {
        if(n<=2)
        {
            return 0;
        }
        //sieve of erathostenes
        boolean primes[]=new boolean[n];
        Arrays.fill(primes,true);
        primes[0]=false; //0 is not prime
        primes[1]=false; //1 is not prime
        for(int p=2;p*p<n;p++)
        {
            if(primes[p])
            {
                for(int i=p*p;i<n;i+=p)
                {
                    primes[i]=false;
                }
            }
        }
        int cnt=0;
        for(int i=2;i<n;i++)
        {
            if(primes[i]==true) cnt++;
        }
        return cnt;
    }
}