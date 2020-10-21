import java.util.*;

public class SetsVsLists {
    public static void main(String[] args) {
        Student student1 = new Student(23,"Fred","Flintstone");
        Student student2 = new Student(87,"Barney","Rubble");
        Student student3 = new Student(23,"Fred","Flintstone");

        ArrayList<Student> class1 = new ArrayList<>();
        class1.add(student1);   //index 0
        class1.add(student2);   //index 1
        class1.add(student3);   //index 2

        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);

        List<String> words = Arrays.asList("hello","goodbye","test");
        System.out.println(words);
        Collections.sort(class1);
        System.out.println(words);
    }
}
