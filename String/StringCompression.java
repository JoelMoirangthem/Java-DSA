// package String;

public class StringCompression {
     
    public StringBuilder compression(String word){
        StringBuilder ans = new StringBuilder("");
        int j =  1;
        int count = 1;
        ans.append(word.charAt(0));
        while(j < word.length()){
            if (word.charAt(j) == word.charAt(j-1)){
                count ++;
            }else{
                ans.append(count);
                count = 1;
                ans.append(word.charAt(j));
            }
            j++;
        }
        ans.append(count);
        return ans;
    }
    public static void main(String[] args) {
        StringCompression obj = new StringCompression();
        System.out.println(obj.compression("aaaabb"));
        System.out.println(obj.compression("aaaabbbc"));
        System.out.println(obj.compression("JOel"));
    }
}
