package oop;

public class Test {
    public static void main(String[] args){
//        Teacher teacher = new Teacher("arif","male",0175);
//        teacher.display();

        Person p1 = new Person();
        p1.setName("arif");
        p1.setAge(20);

        System.out.println("name of the person:"+p1.getName());
        System.out.println("age of the person:"+p1.getAge());

    }
}
