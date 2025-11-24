// package String;

public class Palindrome {
    private String Word;
    public Palindrome(String word){
        this.Word = word;
    }
    public boolean checkPalindrome(){
        int start = 0;
        int end = this.Word.length() - 1;
        
        while(start < end){
            if (this.Word.charAt(start) != this.Word.charAt(end)){
                return false;
            }
            start ++;
            end -- ;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome obj = new Palindrome("joeldeoj");
        System.out.println(obj.checkPalindrome());
    }
}
