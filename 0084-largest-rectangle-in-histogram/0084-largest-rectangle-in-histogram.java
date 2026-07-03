class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;

        for (int i = 0; i <= heights.length; i++) {

            while (!st.isEmpty() &&
                   (i == heights.length || heights[st.peek()] > heights[i])) {

                int h = heights[st.pop()];

                int width;
                if (st.isEmpty())
                    width = i;
                else
                    width = i - st.peek() - 1;

                max = Math.max(max, h * width);
            }

            st.push(i);
        }

        return max;
    }
}