class Solution {
    public int digitSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=1;i<=n;i++){
            int digitSum=digitSum(i);
            if(hm.containsKey(digitSum)){
                hm.put(digitSum,hm.get(digitSum)+1);
            }else{
                hm.put(digitSum,1);
            }
        }

        int largest=Integer.MIN_VALUE;
        int count=0;
        for(int i: hm.keySet()){
            if(hm.get(i)==largest){
                count++;
            }
            if(hm.get(i)>largest){
                count=1; largest=hm.get(i);
            }
        }
        return count;
    }
}
