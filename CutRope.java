public class CutRope {
    public static int cutRope(int target) {
        if (target <= 3){
            return target-2;
        }
        int ropes = target/3;
        int last_rope = target%3;
        if (last_rope == 1){
            return (int)Math.pow(3,ropes-1)*4;
        }else if(last_rope == 2){
            return (int)Math.pow(3, ropes)*2;
        }else{
            return (int)Math.pow(3, ropes);
        }
    }

    public static int cutAccumulate(int target, int currentLength){
        if (target <= 4){
            return currentLength*target;
        }else{
            return cutAccumulate(target-3, currentLength*3);
        }
    }

    public static void main(String[] args) {
        System.out.println(cutRope(55));
        System.out.println(cutAccumulate(55, 1));
    }

}