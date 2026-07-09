class Solution {
    
    public boolean isPreAndSuff(String word1, String word2) {
        
        if(word2.length() < word1.length())
            return false;
        
        int k = word1.length();
        int ind = word2.length() - k;
        for(int i=0 ; i<k ; i++)
        {
            if(word1.charAt(i) != word2.charAt(i) || word1.charAt(i) != word2.charAt(ind++))
                return false;
        }
        
        return true;
    } 

    public int countPrefixSuffixPairs(String[] words) {
        
        int n = words.length, count = 0;
        for(int i=0 ; i<n ; i++)
        {
            for(int j=i+1 ; j<n ; j++)
            {
                if(isPreAndSuff(words[i], words[j]))
                    count++;
            }
        }
        
        return count;
    }
}