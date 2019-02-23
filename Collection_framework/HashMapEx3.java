package Collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by bobsang89@gmail.com on 2019-02-22
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class HashMapEx3 {
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("Friend", "Sang" , "000-000-0000");
        addPhoneNo("Friend", "Jun", "111-111-1111");
        addPhoneNo("Friend", "Jun", "222-222-2222");
        addPhoneNo("Company", "Park", "333-333-3333");
        addPhoneNo("Company", "Park", "444-444-4444");
        addPhoneNo("Company", "Ha", "555-555-5555");
        addPhoneNo("Company", "Yeon", "666-666-6666");
        addPhoneNo("Kim", "777-777-7777");

        printList();
    }
    static void addPhoneNo(String groupName, String name, String number){
        addGroup(groupName);
        HashMap group = (HashMap)phoneBook.get(groupName);
        group.put(number, name);
    }
    static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName))
            phoneBook.put(groupName, new HashMap());
    }
    static void addPhoneNo(String name, String number){
        addPhoneNo("ETC", name, number);
    }
    static void printList(){
        Set set = phoneBook.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            Map.Entry e = (Map.Entry)iterator.next();

            Set subSet = ((HashMap)e.getValue()).entrySet();
            Iterator subIterator = subSet.iterator();
            System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

            while(subIterator.hasNext()){
                Map.Entry subEntry = (Map.Entry)subIterator.next();
                String number = (String)subEntry.getKey();
                String name = (String)subEntry.getValue();
                System.out.println(name + " " + number);
            }
            System.out.println();
        }

    }
}
