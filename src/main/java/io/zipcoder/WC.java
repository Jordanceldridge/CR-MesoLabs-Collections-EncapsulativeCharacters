package io.zipcoder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WC {
    private Iterator<String> si;
    private TreeMap<String, Integer> dictionary = new TreeMap<String, Integer>();

    public WC(String fileName) {
        try {
            this.si = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " Does Not Exist");
            System.exit(-1);
        }
    }

    public WC(Iterator<String> si) {
        this.si = si;
    }

    public TreeMap<String, Integer> countAllTheWordsInFile() {
        // This is looking at my input and seeing if there is more data
        while (si.hasNext()) {
            // we are replacing all the punctuation with a empty string & changing it all to lower case.
            String words = si.next().replaceAll("\\W", "").toLowerCase();
            Integer count = dictionary.get(words);
            // if count is empty then set the count to 0 & add 1
            if (count == null) {
                count = 0;
            }
            dictionary.put(words, count + 1);
        }

        return dictionary;

    }
}
    public String printOutWordsInDescendingOrder(){
       //create a linked list so we can sort it
        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String, Integer>>(dictionary.entrySet());
       //sort the list
        Collections.sort(list,((o1,o2) -> o2.getValue().compareTo(o1.getValue())));
       //create a temp linkedhashmap
        Map<String,Integer> temp = new LinkedHashMap<>();
        //loop to put entry in to the temp linkedhashmap
        for (Map.Entry<String,Integer>entry : list){
            temp.put(entry.getKey(),entry.getValue());
        }
        StringBuilder sb = new StringBuilder();
        for (String  key: temp.keySet()) {
         sb.append(key + " " + temp.get(key)) ;
        }

        return sb.toString();

    }

}
