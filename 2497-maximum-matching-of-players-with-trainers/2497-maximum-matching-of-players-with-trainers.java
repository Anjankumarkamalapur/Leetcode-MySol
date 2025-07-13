class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int cnt=0;
        int i=0;
        int j=0;
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                cnt++;
                i++;
                j++;
            }
            else j++;
        }
        return cnt;
    }
}