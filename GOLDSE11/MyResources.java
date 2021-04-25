import java.util.ListResourceBundle;

public class MyResources extends ListResourceBundle {
    
    private static  final String contents[][] = {
        {"OK", "FileOPen"},
        {"NG","FileClose"}
    };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
    
}
