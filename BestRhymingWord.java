import java.util.*;

class BestRhymingWord{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            sc.nextLine();

            String line = sc.nextLine();
            String[] words = line.split(" ");

            if(words.length != n){
                System.out.println("Error");
                return;
            }

            List<String> arr = Arrays.asList(words);

            String input = sc.nextLine();
            String result = findBestRhymingWord(arr, input);
            System.out.print(result);

        }
    }
    public static String findBestRhymingWord(List<String> arr, String input){
        String bestWord = " ";
        int maxSuffixLength = 0;

        for(String word : arr){
            int currentSuffixLength = longestCommonSuffix(word, input);
            if(currentSuffixLength > maxSuffixLength || currentSuffixLength == maxSuffixLength && word.length() == bestWord.length() ){
                bestWord = word;
                maxSuffixLength = currentSuffixLength;
            }
        }
        return bestWord;

    }
    public static int longestCommonSuffix(String word1, String word2){
        int i = word1.length()-1;
        int j = word2.length()-1;
        int length = 0;

        while(i >= 0 && j >=0 && word1.charAt(i) == word2.charAt(j)){
            length++;
            i--;
            j--;
        }
        return length;
    }
}