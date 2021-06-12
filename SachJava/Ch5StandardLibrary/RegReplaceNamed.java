package Ch5StandardLibrary;

public class RegReplaceNamed {
    public static void main(String[] args) {
        var str = "仕事用はwings@example.comです。";
        System.out.println(
                str.replaceAll("(?i)(?<localname>[a-z0-9.!#$&'*+/=?^_{|}~-]+)@(?<domain>[a-z0-9-]+(?:¥¥.[a-z0-9-]+)*)",
                        "${domain}の${localname}"));
    }
}