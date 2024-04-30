package Task3;

import java.util.*;

/**
 * Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
 * Найдите человека с самым маленьким номером телефона
 * Найдите номер телефона человека чье имя самое большое в алфавитном порядке
 */
public class Task03 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = Map.of("234243243", "Yury", "412341", "Oleg",
                "1324", "Yulia", "123", "Joshua", "22", "Antony");
        Set<String> phones = phoneBook.keySet();
        System.out.println(phoneBook);
        //String keyMin = Collections.min(phones, (o1, o2) -> o1.length() - o2.length());
        System.out.println("____________________________".repeat(3));
        // System.out.println(phoneBook.get(keyMin) + " -> " + keyMin);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result;
                result = o1.length() - o2.length();
                if (result == 0) {
                    return o1.compareTo(o2);
                }
                return result;
            }
        };

        String keyMin = Collections.min(phones, comparator);
        System.out.println(phoneBook.get(keyMin) + " -> " + keyMin);
        System.out.println("____________________________".repeat(3));

        Collection<String> names = phoneBook.values();
        String nameMax = Collections.max(names, (o1, o2) -> o1.compareTo(o2));
        List<String> namePhones = new ArrayList<>();
        for (var entry : phoneBook.entrySet()) {
            if (nameMax.equals(entry.getValue())) {
                namePhones.add(entry.getKey());
            }
        }
        for (String namePhone : namePhones) {
            System.out.println(nameMax + " -> " + namePhone);
        }
    }
}


/**
 * HashMap<String,Object> map=new HashMap<String,Object>();
 * Set<Map.Entry<String,Object>> entrySet=map.entrySet();
 * <p>
 * Object desiredObject=new Object();//что хотим найти
 * for (Map.Entry<String,Object> pair : entrySet) {
 * if (desiredObject.equals(pair.getValue())) {
 * return pair.getKey();// нашли наше значение и возвращаем  ключ
 * }
 * }
 * <p>
 * Map<String, Object> maps = new HashMap<>();
 * Object value = new Object();
 * <p>
 * Optional<String> result = maps.entrySet()
 * .stream()
 * .filter(entry -> value.equals(entry.getValue()))
 * .map(Map.Entry::getKey)
 * .findFirst();
 * <p>
 * if (result.isPresent())
 * System.out.println(result.get());
 */
