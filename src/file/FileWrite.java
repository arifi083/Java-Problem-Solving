package file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args){
        String id,name;

        try {
            Formatter formatter = new Formatter("C:/Users/Arif/IdeaProjects/JavaPractise/javaFile/student.txt");

            Scanner input = new Scanner(System.in);
            System.out.println("how many students");

            int num = input.nextInt();

            for(int i=1;i<=num;i++){
                System.out.println("enter student name and id");
                name = input.next();
                id = input.next();
                formatter.format("%s %s \r\n",name,id);

            }
            formatter.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
