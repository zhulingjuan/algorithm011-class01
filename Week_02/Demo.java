import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(2);

        Integer peek = integers.peek();

        System.out.println(peek);

    }
}
