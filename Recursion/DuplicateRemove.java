public class DuplicateRemove {
    public StringBuilder result(String word , StringBuilder ans,int i,boolean []arr  ){
        if (i == word.length()){
            return ans;
        }
        if (arr[word.charAt(i) - 'a'] == false){
            arr[word.charAt(i) - 'a'] = true;
            ans.append(word.charAt(i));
        }
        return result(word, ans, i + 1, arr);
    }
    public static void main(String[] args) {
        DuplicateRemove obj = new DuplicateRemove();
        System.out.println(obj.result("apnaman", new StringBuilder(""), 0, new boolean[26]));
    }
}
