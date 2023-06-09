class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> values = new ArrayList<>();
        for(int i=1;i<=n;i++){
            values.add(i);
        }
        return findNum(values, k, 0);
        
    }
    int findNum(List<Integer> values,int k, int i){
        if(values.size() == 1){
            return values.get(0);
        }
        i = (i + k-1) % values.size();
        values.remove(i);
        return findNum(values, k, i);
    }
}