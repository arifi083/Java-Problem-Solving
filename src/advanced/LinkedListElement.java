package advanced;

import java.util.LinkedList;

public class LinkedListElement {
    public static void main(String[] args){
        LinkedList<String>countryNames = new LinkedList<String>();
        countryNames.add("bd");
        countryNames.add("ind");
        countryNames.add("afg");
        countryNames.add("sl");

        System.out.println("countrylist:" +countryNames);

        for(String country: countryNames){
            System.out.println(country);
        }

        System.out.println("size of country list:" +countryNames.size());

        countryNames.add(4,"aus");

        countryNames.addFirst("USA");
        countryNames.addLast("japan");

        System.out.println("list of the country:" +countryNames);

        
    }
}
