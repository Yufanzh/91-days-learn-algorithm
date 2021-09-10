class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        //consider elementary math adding, so start from end to head
        //answer will need to be an array of size num.length+1
        //consider carry
        //formula: current value = [A's current value + B's current value + carry] % 10
        //time complexity: O(n); space complexity: O(n)
        //add to the end of an arraylist and then reverse it can be faster
        List<Integer> ans = new ArrayList<Integer>();
        int idx = num.length - 1;
        int sum = 0;
        int carry = 0;
        while(idx >=0 || k!=0){// condition, either of those nums has un added number
            int x = idx >=0 ? num[idx]:0;
            int y = k !=0 ? k%10 : 0;
            
            sum = x + y + carry;
            carry = sum/10;
            k = k/10;
            sum %= 10;
            
            //move idx to the left and repeat
            idx--;
            ans.add(sum);
        }
        
        //in the end, check if carry ==0
        if(carry != 0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
        
        
    }
}
