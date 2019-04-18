import java.util.*;

public class SortHashMapByKey {

    public static void main(String args[]){
        Map<String, List<String>> myHashMap = new TreeMap<>();
        List<String> myList = new ArrayList<String>();
        List<String> emptyList = new ArrayList<String>();
        List<String> nullList = null;

        for(int i = 1; i <= 2; i++){
            myList.add("Element " + i);
        }
        for(int i = 1; i <= 2; i++){
            myHashMap.put("Key " + i, myList);
        }

        myHashMap.put("Key 3", emptyList);
        myHashMap.put("Key 4", nullList);

        System.out.println("myList: " + myList);
        System.out.println("myHashmap: " + myHashMap);

        for(String key : myHashMap.keySet()){

            if (myHashMap.get(key) == null){
                System.out.println("The array in the " + key + " is null");
            }
            try {
                if (myHashMap.get(key).size() <= 0){
                    System.out.println("The array in the " + key + " have no values");
                }else{
                    System.out.println(key + " " + myHashMap.get(key));
                }
            }catch (Exception e){
                //No problem, it's okay :)
                //It happened as I expected
            }
        }
    }
}
