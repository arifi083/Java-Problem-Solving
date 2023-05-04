package file;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args){
        File file1 = new File("C:/Users/Arif/IdeaProjects/JavaPractise/javaFile/student.txt");
        File file2 = new File("C:/Users/Arif/IdeaProjects/JavaPractise/javaFile/teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("files are created successfully");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        file2.delete();
        if (file2.exists()){
            System.out.println("file2 exist");
        }
        else{
            System.out.println("file2 is not exists");
        }
    }
}
