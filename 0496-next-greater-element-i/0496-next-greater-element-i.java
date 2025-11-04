class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        LinkedList<Integer> stack= new LinkedList<>();
        //nested for loop
        //iterate through nums1
        //iterate through num2 until currect value for num1 is found
        //if the next number of num 1 value is geater, push the value or push -1
        //return the stack

        //edge cases
        if (nums1.length==0 || nums1.length>nums2.length || nums2.length>1000){
            return null;
        }
        
        for (int i=0; i<nums1.length; i++){
            int same=0;
            boolean match= false;
            for (int j=0; j<nums2.length; j++){
                if (nums1[i]== nums2[j]){
                    same=nums2[j];
                    for (int k= j; k<nums2.length; k++){
                        if (nums2[k]>same){
                            stack.push(nums2[k]);
                            match= true;
                            break;
                        }
                    }
                    
                }
                
            }
            if (!match) {
                stack.push(-1);
            }
        }
         
        int[] ans= new int[nums1.length];
        for (int k=nums1.length-1; k>=0; k--){
            ans[k]= stack.pop();
        }

        return ans;
    }
}