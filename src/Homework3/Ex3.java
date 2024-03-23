package Homework3;

public class Ex3 {
    public static void main(String[] args) {
        CustomList<String> list;
        list = new CustomList<>();
        list.add("Элемент 1");
        list.add("Элемент 2");
        list.add(1, "Элемент 3");
        System.out.println("Размер списка: " + list.size());
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.clear();
        System.out.println("Список очищен. Размер списка: " + list.size());
    }
}

