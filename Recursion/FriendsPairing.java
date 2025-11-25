public class FriendsPairing {
    public int result(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return result(n-1) + (n-1)*result(n-2);
    }
    public static void main(String[] args) {
        FriendsPairing obj = new FriendsPairing();
        System.out.println(obj.result(2));
    }
}
