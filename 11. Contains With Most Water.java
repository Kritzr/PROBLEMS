class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int result = 0;

        while(left<right){
            int area = Math.min(height[left], height[right]) * (right-left);
            result = Math.max(result, area);
            if(height[left] <= height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return result;
    }
}
