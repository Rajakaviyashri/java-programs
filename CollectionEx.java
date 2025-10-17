package selfff;

import java.util.ArrayList;

public class CollectionEx {
public static void main(String [] args) {

ArrayList <Integer> obj =new  ArrayList<>();

obj.add(2);
obj.add(3);
obj.add(4);
obj.add(8);
obj.add(5);
System.out.println(obj);

ArrayList <Object> a = new ArrayList<>();
a.add(3);
a.add("hello");
a.add(999.88);
a.add("end");
System.out.println(a);
System.out.println(a.get(3));
System.out.println(a.indexOf(3));

}
}
