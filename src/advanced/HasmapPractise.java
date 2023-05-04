package advanced;

import java.util.HashMap;

public class HasmapPractise {
    public static void main(String[] args){
        HashMap<String,String> capitalCities = new HashMap<String,String>();
        capitalCities.put("Bangladesh","Dhaka");
        capitalCities.put("England","Longdon");
        capitalCities.put("India","New Delli");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Bangladesh"));
        capitalCities.remove("Bangladesh");
        System.out.println(capitalCities);

        capitalCities.put("Bangladesh","Dhaka");
        System.out.println(capitalCities.size());

        for(String k:capitalCities.keySet()){
            System.out.println(k);
        }

        for(String v:capitalCities.values()){
            System.out.println(v);
        }


        for(String p:capitalCities.keySet()){
            System.out.println("key:"+p+" "+"value:"+capitalCities.get(p));
        }

    }
}
