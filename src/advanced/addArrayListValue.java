package advanced;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class addArrayListValue {
   public static void main(String[] args){
       ArrayList<Integer> number = new ArrayList<Integer>();
       number.add(10);
       number.add(20);
       number.add(70);
       number.add(16);
       number.add(30);

       System.out.println("size of the arrayList:"+number.size());

       for(int x:number){
           System.out.println(" "+x);
       }

       System.out.println("arraylist value:");

       Iterator itr = number.iterator();
       while (itr.hasNext()){
           System.out.println(" "+itr.next());
       }

       boolean check = number.isEmpty();
       System.out.println("arraylist empty:" + check);

       boolean contain = number.contains(30);
       System.out.println("30 is in the list:" + contain);

       int position = number.indexOf(30);
       System.out.println("the index of 30 is:" + position);

       number.set(2,40);
       System.out.println("after setting number:" +number);

       int x = number.get(2);
       System.out.println("index of 0 is:"+x);


       System.out.println("before sorting:"+number);
       Collections.sort(number);
       System.out.println("after sorting:"+number);

       Collections.sort(number,Collections.reverseOrder());
       System.out.println("after sorting desending order:"+number);
   }
}
