package Ch5StandardLibrary;

public class RegReplace {
    public static void main(String[] args) {
        var str = "サポートサイトはhttps://www.wings.msn.to/です.";
        System.out.println(
                str.replaceAll("(?i)http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w .?%&=-]*)?", "<a href=\"$0\">$0</a>"));
        var st = "私の名前は桜。桜と呼ばれます。";
        System.out.println(st.replace("桜", "サクラ"));
    }
}
