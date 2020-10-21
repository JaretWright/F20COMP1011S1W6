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

        //create an ArrayList of words
        List<String> words = Arrays.asList("hello","goodbye","test");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(words);

        System.out.println(class1);
        Collections.sort(class1);
        System.out.println(class1);

        //defining our own custom sort method by creating
        //an anonymous inner class
        Collections.sort(class1, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getFirstName().compareTo(s2.getFirstName());
            }
        });

        System.out.println(class1);

        //defining our own customer sort using a Lambda expression
        Collections.sort(words, (word1, word2) ->{
            return word1.length()-word2.length();
        });

        System.out.println(words);

        //What's with Sets ... aren't they the same as a list?
        HashSet<Student> class2 = new HashSet();
        class2.add(student1);
        class2.add(student2);
        class2.add(student3);

        System.out.println("HashSet: "+class2);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(words);
        System.out.println("HashSet of String objects: "+hashSet);
        hashSet.add("test");
        System.out.println("HashSet of String objects: "+hashSet);
        words.add("test");
        System.out.println("ArrayList of String objects: "+words);


    }

}
