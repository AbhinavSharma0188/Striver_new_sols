public class q47_palindrome_String {
    public static void main(String[] args) {
        String str="abhi";
        boolean result=isPalindrome(str,0,str.length()-1);
        if(result){
            System.out.println("Yes the string is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }

        

    }
    public static boolean isPalindrome(String str,int left,int right){
        if(left>=right){
            return true;
        }
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        return isPalindrome(str, left+1, right-1);
    }
    
}
