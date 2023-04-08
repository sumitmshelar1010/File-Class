package MainPackage.fileclassinjava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileAbsoluteNameObject {//FILE OBJECT CREATION FOR TEST FILE

static String path;
public static void main(String[] args) throws IOException {
    File f1 =new File("C:\\Users\\Public\\Sumit\\New folder\\Note123");
    f1.createNewFile();// File Created
   System.out.println(f1.getCanonicalFile());
    System.out.println(f1.getParent());
    System.out.println(f1.isAbsolute());
    FileWriter fw = new FileWriter(f1);// TO write in file
    fw.write("blvccticicctc");
fw.close();


    //File f2 =new File("C:/Users/Public/Sumit/New folder/Note123");


   // File f3 =new File(System.getProperty("src/MainPackage.fileclassinjava/Note123.txt"));


    /*THIS DEFINED AN ABSTRACT FILE NAME FOR
    THE TEST FILE IN THE DIRECTORY "C:\Users\Public\Sumit\New folder"*/
}
}
