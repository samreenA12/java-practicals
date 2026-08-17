import java.util.*;

class CopyList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");

        List<String> list2 = new ArrayList<>(list1);

        System.out.println("Original List: " + list1);
        System.out.println("Copied List: " + list2);
    }
}
