package file;

import java.io.File;
import java.util.Scanner;

public class FilwRead {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/Arif/IdeaProjects/JavaPractise/javaFile/student.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()){
                String name = sc.next();
                String id = sc.next();
                System.out.println("name: "+name +" "+"id: "+id);
            }
            sc.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
