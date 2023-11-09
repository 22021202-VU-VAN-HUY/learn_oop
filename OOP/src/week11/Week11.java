package week11;

import java.util.Collections;
import java.util.List;

public class Week11 {
    /**
     * .
     *
     * @param list .
     * @param <T>  .
     * @return .
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    T temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}
