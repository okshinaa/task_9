package ru.vsu.cs.okshina_v_a;

import java.util.*;

public class SortNumbersOfList {
    public static List<Integer> process(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j =0; j < list.size() - 1; j++) {
                if (list.get(j) >= 0 && list.get(j+1) < 0) {
                    int tmp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, tmp);
                }
            }
        }
        return list;
    }
}
