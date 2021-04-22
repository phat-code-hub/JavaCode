package Localize;

import java.util.Locale;
import java.util.ResourceBundle;

public class Bai12_4 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Locale loc = Locale.getDefault();
        ResourceBundle res = ResourceBundle.getBundle("MyResources", loc);
        System.out.println(res.getString("OK"));
    }
}
