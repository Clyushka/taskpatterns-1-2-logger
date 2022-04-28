import java.util.*;

public class Main {
    public static void main (String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner consoleScanner = new Scanner(System.in);
        int arrSize = 0;
        while (arrSize <= 0) {
            System.out.print("Введите размер списка: ");
            try {
                arrSize = consoleScanner.nextInt();
                if (arrSize < 0) {
                    System.out.println("Необходимо ввести положительное число");
                }
            } catch (NoSuchElementException | IllegalStateException e) {
                consoleScanner.next();
                System.out.println("Необходимо ввести положительное число");
            }
        }

        int maxValue = 0;
        while (maxValue <= 0) {
            System.out.print("Введите верхнюю границу для значений: ");
            try {
                maxValue = consoleScanner.nextInt();
                if (maxValue < 0) {
                    System.out.println("Необходимо ввести положительное число");
                }
            } catch (NoSuchElementException | IllegalStateException e) {
                consoleScanner.next();
                System.out.println("Необходимо ввести положительное число");
            }
        }

        logger.log("Создаём и наполняем список");
        List<Integer> intArr = new ArrayList<>(arrSize);
        IntArrayListFiller arrayFiller = new IntArrayListFiller(maxValue, arrSize);
        intArr = arrayFiller.fillList(intArr);
        logger.log(IntArrayListFiller.listToString(intArr, "Вот случайный список:"));

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        int filterInt = 0;
        while (filterInt <= 0) {
            System.out.print("Введите порог для фильтра: ");
            try {
                filterInt = consoleScanner.nextInt();
                if (filterInt < 0) {
                    System.out.println("Необходимо ввести положительное число");
                }
            } catch (NoSuchElementException | IllegalStateException e) {
                consoleScanner.next();
                System.out.println("Необходимо ввести положительное число");
            }
        }

        Filter filter = new Filter(filterInt);
        intArr = filter.filterOut(intArr);
        logger.log(IntArrayListFiller.listToString(intArr, "Выводим результат на экран\nОтфильтрованный список:"));
        logger.log("Завершаем программу");
    }
}
