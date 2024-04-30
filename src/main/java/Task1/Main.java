package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Создайте коллекцию мужских и женских имен с помощью интерфейса List
 * Отсортируйте коллекцию в алфавитном порядке
 * Отсортируйте коллекцию по количеству букв в слове
 * Разверните коллекцию
 */
public class Main {
    public static void main(String[] args) {
        List<String> humanNames = new ArrayList<>();
        humanNames.add("Jackson");
        humanNames.add("Valera");
        humanNames.add("Yury");
        System.out.println(humanNames);
        System.out.println("____________________________".repeat(3));

        List<String> womanNames = new ArrayList<>();
        womanNames.add("Vera");
        womanNames.add("Margarita");
        womanNames.add("Yulia");
        System.out.println(womanNames);
        System.out.println("____________________________".repeat(3));

        List<String> allNames = new ArrayList<>();
        allNames.addAll(humanNames);
        allNames.addAll(womanNames);

        Collections.sort(allNames);
        System.out.println(allNames);
        System.out.println("____________________________".repeat(3));

        Collections.sort(allNames, ((o1, o2) -> o1.length() - o2.length()));
        System.out.println(allNames);
        System.out.println("____________________________".repeat(3));

        Collections.reverse(allNames);
        System.out.println(allNames);
        System.out.println("____________________________".repeat(3));

        allNames.sort(Comparator.comparingInt(String::length));
        System.out.println(allNames);


    }
}