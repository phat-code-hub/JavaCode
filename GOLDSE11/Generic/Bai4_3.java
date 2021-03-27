package GOLDSE11.Generic;

import java.util.*;

class AA {
}

class BB extends AA {
};

public class Bai4_3 {
    public void addData(List<? super BB> list) {
        list.add(new BB());
    }
    // Extends -> NG
    // public void addData(List<? extends BB> list) {
    // list.add(new BB());
    // }
}
