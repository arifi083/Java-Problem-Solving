package oop;

public class Teacher {
    String name,gender;
    int phone;

    Teacher(){
        System.out.println("No value");
    }
    Teacher(String n,String g,int p){
        name =n;
        gender =g;
        phone = p;
    }

    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Phone:"+phone);
    }
}
