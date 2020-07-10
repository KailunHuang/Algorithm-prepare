import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexMatch {

    public static boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        if(matcher.matches()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isNumber(String s) {
        //^?[+|-][0-9]*?.[0-9]*$
        Pattern pattern = Pattern.compile("^[-|+]?([0-9]*(\\.?[0-9]+)?)?([0-9]+e[0-9]+)?([0-9]+\\s?)?$");
        Matcher matcher = pattern.matcher(s);
        if(matcher.matches()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isNumber(" "));
    } 
    
}