import java.util.ArrayList;
import java.util.List;

public class NullToString {

    public static void main(String args[]){
        System.out.println("Hello World!");


        List<String> nullList = new ArrayList<String>();
        nullList.add(null);
        nullList.add("Value 1");

        System.out.println("Array: " + nullList);

        
        for (int i = 0; i < nullList.size(); i++) {
            String v = (nullList.get(i) == null) ? "NULL": nullList.get(i);
            System.out.println("Inside array: " + v);


        }
        System.out.println("Array after: " + nullList);

    }
}
