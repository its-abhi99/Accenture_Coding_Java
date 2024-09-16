import java.util.*;

class ExtractMaxSizeWordFromString {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String input = sc.nextLine();

            String word = LongestWord(input);
            int wordLength = word.length();
            System.out.print(word +":" +wordLength);
            
        }  
    } 
    public static String LongestWord(String input){
        int n = input.length();
        int maxLen = 0;
        int currLen = 0;
        int startIdx = 0;
        int longestWordStartIdx = 0;

        for(int i=0; i<n; i++){
            if(input.charAt(i) != '.'){
                currLen++;
            }else{
                if(currLen > maxLen){
                    maxLen = currLen;
                    longestWordStartIdx = startIdx;
                }
                currLen = 0;
                startIdx = i+1; 
            }
        }
        if(currLen > maxLen){
            maxLen = currLen;
            longestWordStartIdx = startIdx;
        }

        String longestWord = input.substring(longestWordStartIdx, longestWordStartIdx + maxLen);
        return longestWord;
        
    }       
}