import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

//Methods to add,remove,query
//Hashmaps will always be unordered for efficienty
//A hash is a function from one set to another set that 
//Things(Strings) -> hash values(numbers)
//Properties of hash-maps: 1) can collide
//2) The hash function need not be one-to-one.
//3) They usually one-to-one.
//purpose of hashing -> a great way to do rapid look-up and storage of values into arrays or lists.

public class NewHashmap {
    public static void main(String[] args) {
        // Demo of built-in HashMap Class
        HashMap<String, Integer> x = new HashMap<>();
        x.put("Andi", 100);
        //these names are turning into some number.
        x.put("Amry", 51);
    }

}
