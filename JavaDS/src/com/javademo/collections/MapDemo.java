package com.javademo.collections;

import java.util.HashMap;

class Key { 
	
    String key; 
    Key(String key) 
    { 
        this.key = key; 
    } 
  
    @Override
    public int hashCode() 
    { 
        int hash = (int)key.charAt(0); 
        System.out.println("hashCode for key: "
                           + key + " = " + hash); 
        return hash; 
    } 
  
    @Override
    public boolean equals(Object obj) 
    { 
        return key.equals(((Key)obj).key); 
    } 
} 
  
// Driver class 
public class MapDemo { 
	
    public static void main(String[] args) 
    { 
        HashMap map = new HashMap(); 
        map.put(new Key("vishal"), 20); 
        map.put(new Key("sachin"), 30); 
        map.put(new Key("vaibhav"), 40); 
  
        System.out.println(); 
        System.out.println("Value for key sachin: " + map.get(new Key("vishal"))); 
        System.out.println("Value for key sachin: " + map.get(new Key("sachin"))); 
        System.out.println("Value for key vaibhav: " + map.get(new Key("vaibhav"))); 
    } 

}

//class MapDemo 
//{ 
//   public static void main(String args[]) 
//   { 
//       Map< String,Integer> hm =  
//                        new HashMap< String,Integer>(); 
//       hm.put("a", new Integer(100)); 
//       hm.put("b", new Integer(200)); 
//       hm.put("c", new Integer(300)); 
//       hm.put("d", new Integer(400)); 
//  
//       // Returns Set view      
//       Set< Map.Entry< String,Integer> > st = hm.entrySet();    
//  
//       for (Map.Entry< String,Integer> me:st) 
//       { 
//           System.out.print(me.getKey()+":"); 
//           System.out.println(me.getValue()); 
//       } 
//   } 

//public static void main(String[] args) 
//{ 
//    // Create an empty hash map 
//    HashMap<String, Integer> map 
//        = new HashMap<>(); 
//
//    // Add elements to the map 
//    map.put("vishal", 10); 
//    map.put("sachin", 30); 
//    map.put("vaibhav", 20); 
//
//    // Print size and content 
//    System.out.println("Size of map is:- "
//                       + map.size()); 
//    System.out.println(map); 
//
//    // Check if a key is present and if 
//    // present, print value 
//    if (map.containsKey("vishal")) { 
//        Integer a = map.get("vishal"); 
//        System.out.println("value for key"
//                           + " \"vishal\" is:- "
//                           + a); 
//    } 
//} 
//} 
