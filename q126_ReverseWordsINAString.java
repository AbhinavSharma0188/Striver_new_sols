public class q126_ReverseWordsINAString {
    public static void main(String[] args) {
        String s="the sky is blue";
        String[] words = s.split(" ");

        for(int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
    }

    
}