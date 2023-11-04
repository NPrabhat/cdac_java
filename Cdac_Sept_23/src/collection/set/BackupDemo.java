package collection.set;

import java.util.*;

public class BackupDemo {
    public static void main(String[] args) {
        List<Integer> originallst = new ArrayList<>();
        originallst.add(100);
        originallst.add(200);
        originallst.add(300);
        System.out.println(originallst);
        List<Integer> backuplst = originallst.subList(0, originallst.size());
        System.out.println(backuplst);
    }
}
