import java.util.ArrayList;
import java.util.List;

public class StringListReverser {
    private List<String> stringList;

    public StringListReverser(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<String> reverseList() {
        List<String> reversedList = new ArrayList<>();
        for (int i = stringList.size() - 1; i >= 0; i--) {
            reversedList.add(stringList.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();
        stringsList.add("apple");
        stringsList.add("banana");
        stringsList.add("cherry");
        stringsList.add("date");

        StringListReverser reverser = new StringListReverser(stringsList);
        List<String> reversedStringsList = reverser.reverseList();//for creating empty array.

        System.out.println("Original list of strings: " + stringsList);
        System.out.println("Reversed list of strings: " + reversedStringsList);
    }
}
