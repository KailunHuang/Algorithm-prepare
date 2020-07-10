/***
 * created by huang ON 2020/7/7
 */

public class fib {
    public static int recursive(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return recursive(n-1)+recursive(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive(44));
    }
}
