// package String;

public class LargestString {
    private String[] lst;
    public LargestString(String arr[]){
        this.lst = arr;
    }
    public String findLargest(){
        String ans = this.lst[0];
        for(int i = 1 ; i < this.lst.length ; i++){
            if(ans.compareTo(this.lst[i]) < 0 ){
                ans = lst[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String [] lst = new String[]{"apple","mango","banana"};
        LargestString obj = new LargestString(lst);
        System.out.println(obj.findLargest());
    }
}
