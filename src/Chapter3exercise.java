import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Chapter3exercise {
    public static void main(String[] args) {
        int[] arrayInt = {1, 1, 1, 5, 6};

        for(int i=0; i < arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }

        Map<Integer, String> studentGradeBook = new HashMap<>();
        studentGradeBook.put(001,"Bob");
        studentGradeBook.put(002,"Dob");


        System.out.println(studentGradeBook.entrySet());

        Iterator<Map.Entry<Integer,String>> it = studentGradeBook.entrySet().iterator();
        System.out.println(it);
    }
}
