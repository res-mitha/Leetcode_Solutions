class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = (height.length)-1;
        int maxarea =0;
        while(left<right){
            int currentarea = Math.min(height[right],height[left]) * (right - left);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
              if(currentarea > maxarea){
                  maxarea = currentarea;
                
            }
        }  
        return maxarea;     
    }
}