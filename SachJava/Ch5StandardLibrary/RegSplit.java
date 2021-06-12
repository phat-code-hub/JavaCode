package Ch5StandardLibrary;

import java.util.regex.Pattern;

public class RegSplit {
    public static void main(String[] args) {
        var str = "にわには3わうらにわに51わにわとりがいる";
        var re = Pattern.compile("\\d{1,}わ");
        var result = re.split(str);
        System.out.println(String.join(" ", result));
    }
}
