/***
 * created by huang ON 2020/7/7
 */

public class replaceSpace {
    public static String replaceSpace(String s){
        String[] list = s.split(" ",-1);
        System.out.println(list.length);
        String result= "";
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
            if (i < list.length - 1) {
                result = result + list[i] + "%20";
            } else {
                result = result + list[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("   "));
    }
}
