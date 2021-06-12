package Ch5StandardLibrary;

import java.util.regex.*;

public class Bai5_2_2 {
    public static void main(String[] args) {
        var mail_goc = "お問い合わせはsupport@example.comまで";
        var mail_pat = "[a-z0-9]+([+-.][a-z0-9]+)*@[a-z0-9]+([-.][a-z0-9]+)*\\.[a-z0-9]+([-.][a-z0-9]+)*";
        var mail_com = Pattern.compile(mail_pat);
        var mat = mail_com.matcher(mail_goc);
        var mail_desc = "<a mailto:\"$0\">$0</a>";
        if (mat.find()) {
            var moi = mail_goc.replaceAll(mail_pat, mail_desc);
            System.out.println(moi);
        }

    }
}
