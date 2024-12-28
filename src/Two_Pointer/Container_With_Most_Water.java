package Two_Pointer;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        int[] height = {1,1};
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while( i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            maxArea = Math.max(maxArea, area);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(maxArea);
    }
}
