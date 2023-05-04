package file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args){
        File dir = new File("C:/Users/Arif/Desktop/person");
        dir.mkdir();
        String directoryLocation = dir.getAbsolutePath();
        System.out.println(directoryLocation);
        System.out.println(dir.getName());
        if(dir.delete()){
            System.out.println("file has been deleted");
        }
    }
}
