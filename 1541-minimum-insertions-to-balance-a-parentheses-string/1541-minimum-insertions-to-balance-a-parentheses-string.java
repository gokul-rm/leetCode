class Solution
{
    public int minInsertions(String s)
    {
        s = s.replace("))", "]");
        int leftCount = 0;
        int count = 0;
        for (char ch : s.toCharArray())
        {
            if (ch == '(')
            {
                leftCount++;
            }
            else if ((ch == ']' || ch == ')') && leftCount > 0)
            {
                leftCount--;
                count += ch == ')' ? 1 : 0;
            }
            else
            {
                count += ch == ')' ? 2 : 1;
            }
        }
        return count + leftCount * 2;
    }
}