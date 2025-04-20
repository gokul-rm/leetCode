class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int result = 0;
        int count = 0;
        
        for(int i=0;i<answers.length;i++){
            if(answers[i] == 0){
                result++;              // if 1st rabit says 0 no other there
            }
            else if(i==0 || answers[i] != answers[i-1] || count == 0){
                result += answers[i] + 1; //counts 
                count = answers[i];  //needs to count other rabits ie x+1 (i used)
            }
            else{
                count--; 
            }
        }
        return result;
    }
}
