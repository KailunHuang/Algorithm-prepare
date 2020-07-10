public class CutRope {
    public static int cutRope(int n) {
        if (n <= 3){
            return n-1;
        }else{
            return (int)cutAccumulate(120,1);
        }

    }

    public static long cutAccumulate(int target, long currentLength){
        if (target <= 4){
            return currentLength*target%1000000007;
        }else{
            return cutAccumulate(target-3, (currentLength*3)%1000000007);
        }
    }

    public static int cuttingRope(int n) {
        if(n <= 3) return n - 1;
        int b = n % 3, p = 1000000007;
        long rem = 1, x = 3;
        for(int a = n / 3 - 1; a > 0; a /= 2) {
            if(a % 2 == 1) rem = (rem * x) % p;
            x = (x * x) % p;
        }
        if(b == 0) return (int)(rem * 3 % p);
        if(b == 1) return (int)(rem * 4 % p);
        return (int)(rem * 6 % p);
    }


    public static void main(String[] args) {
        System.out.println(cutRope(120));
        System.out.println(cutAccumulate(120, 1));
        System.out.println(cuttingRope(120));
    }

}