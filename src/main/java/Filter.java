import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        logger.log("Запускаем фильтрацию");
        for (int i = 0; i < source.size(); i++) {
            int val = source.get(i);
            if (val < threshold) {
                logger.log("Элемент \"" + val + "\" не проходит");
            } else {
                result.add(val);
                logger.log("Элемент \"" + val + "\" проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());

        return result;
    }
}
