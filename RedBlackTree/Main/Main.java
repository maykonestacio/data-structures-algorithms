package RedBlackTree.Main;

import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    
    public static void main(String[] args){

        TreeSet<Integer> treeSet = new TreeSet<>();
        
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(70);

        System.out.println("TreeSet: " + treeSet);

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(50, "Fifty");
        treeMap.put(30, "Thirty");
        treeMap.put(70, "Seventy");
        treeMap.put(71, "Seventy");

        System.out.println("TreeMap: " + treeMap);

    }

}
