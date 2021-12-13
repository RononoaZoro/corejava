package treeSet;

import java.util.*;

/**
 * This program sorts a set of item by comparing their descriptions.
 * @version 1.12 2015-06-21
 * @author Cay Horstmann
 */
public class TreeSetTest
{
   public static void main(String[] args)
   {
//      SortedSet<Item> parts = new TreeSet<>();
//      parts.add(new Item("Toaster", 1234));
//      parts.add(new Item("Widget", 4562));
//      parts.add(new Item("Modem", 9912));
//      System.out.println(parts);

//      ArrayList<String> strings = new ArrayList();
//      List rawList = strings; // warning only, not an error, for compatibility with legacy code
//      rawList.add(new Date()); // now strings contains a Date object
//      List<String> safestrings = Collections.checkedList(strings,String.class);
//      rawList = safestrings; // warning only, not an error, for compatibility with legacy code
//      rawList.add(new Date()); // now strings contains a Date object


      Set<String> result = new HashSet(){{
         add("1");
         add("2");
      }};

      Set<String> result1 = new HashSet(){{
         add("3");
         add("2");
      }};
      result.retainAll(result1);
      System.out.println();

   }
}