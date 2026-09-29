class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        Reverse(nums,0,n-1);
        Reverse(nums,0,k-1);
        Reverse(nums,k,n-1);
    }
    void Reverse(int[] nums,int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}