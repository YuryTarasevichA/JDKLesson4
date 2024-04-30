package Task2;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
 * Получите уникальный список Set на основании List
 * Определите наименьший элемент (алфавитный порядок)
 * Определите наибольший элемент (по количеству букв в слове но в обратном порядке) - или по нормальному наименьший:)))
 * Удалите все элементы содержащие букву ‘A’
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan",
                "Yury", "Yulia", "Egor", "Ivan", "Yury", "Ira", "Anastasya");
        System.out.println(names);

        Set<String> uniqName = new HashSet<>(names);
        System.out.println(uniqName);
        System.out.println("____________________________".repeat(3));

        System.out.println(Collections.min(uniqName));
        System.out.println("____________________________".repeat(3));

        //System.out.println(uniqName.stream().min((o1, o2) -> o1.compareTo(o2)).get());
        System.out.println("____________________________".repeat(3));

        System.out.println(Collections.max(uniqName, ((o1, o2) -> o2.length() - o1.length())));
        System.out.println("____________________________".repeat(3));

//        uniqName.removeIf(o -> o.contains("a"));
//        System.out.println(uniqName);

        Iterator<String> iterator = uniqName.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.contains("A") || element.contains("a")) {
                iterator.remove();
            }
        }
        System.out.println(uniqName);
    }


}
