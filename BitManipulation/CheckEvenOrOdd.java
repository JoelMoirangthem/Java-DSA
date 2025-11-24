// package BitManipulation;

public class CheckEvenOrOdd {
    public String check(int num){
        if ((num & 1) == 1){
            return "Odd"; 
        }else{
            return "Even";
        }
    }
    public static void main(String[] args) {
        CheckEvenOrOdd obj = new CheckEvenOrOdd();
        System.out.println(obj.check(5));
        System.out.println(obj.check(7));
        System.out.println(obj.check(6));
    }
}
