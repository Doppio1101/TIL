class Solution {
    public int solution(int[] partA, int[] partB) {
        int result=0;
        
        result = s(partA,partB);
        
        return result;
    }
    
    public int s(int[] partA, int[] partB){
        int result = 0;
        for(int i=0; i<partA.length; i++) {
        	result += partA[i]*partB[i];
        }
        return result;
    }
}