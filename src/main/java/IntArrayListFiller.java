import java.util.*;

public class IntArrayListFiller {
    public static final Random rand = new Random();
    private int maxValue;
    private int size;

    public IntArrayListFiller (int maxValue, int size) {
        if (maxValue > 0) {
            this.maxValue = maxValue;
        }
        if (size > 0) {
            this.size = size;
        }
    }

    public static String listToString(List<Integer> list, String message) {
        StringBuilder result = new StringBuilder(message);
        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            result.append(" " + iterator.next().intValue());
        }
        return result.toString();
    }

    public List<Integer> fillList(List<Integer> list) {
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(maxValue));
        }
        return list;
    }
}
