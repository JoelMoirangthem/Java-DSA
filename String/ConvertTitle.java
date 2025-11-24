// package String;


public class ConvertTitle {
    private StringBuilder str = new StringBuilder("");
    
    public StringBuilder convertToTitle(String words){
        this.str.append(Character.toUpperCase(words.charAt(0)));
        for (int i = 1 ; i < words.length() ; i++){
            if(words.charAt(i) == ' ' && i < words.length() - 1 ){
                this.str.append(words.charAt(i));
                i++;
                this.str.append(Character.toUpperCase(words.charAt(i)));
            }
            else{
                this.str.append(words.charAt(i));
            }
        }
        return this.str;
    }
    public static void main(String[] args) {
        ConvertTitle obj = new ConvertTitle();
        System.out.println(obj.convertToTitle("hello i am from pluto."));
    }
}
