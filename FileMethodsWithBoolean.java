package MainPackage.fileclassinjava;

import java.io.File;
import java.io.IOException;

public class FileMethodsWithBoolean {//METHODS WITH BOOLEAN MODIFIER
    public static void main(String[] args)  {
        File a = new File("C:\\Users\\Public\\Sumit\\New folder");
        try {
            System.out.println(a.createNewFile());
            System.out.println(a.exists());
            System.out.println(a.isAbsolute());
            System.out.println(a.isDirectory());
            System.out.println(a.canExecute());
            System.out.println(a.canRead());
            System.out.println(a.canWrite());
            System.out.println(a.isFile());
            System.out.println(a.isHidden());

        } catch (IOException e) {
            System.out.println("ALL EXCEPTIONS ARE HANDLED");
        }
        System.out.println("All methods with boolean MainPackage.JavaBasics.operators.modifier ");
    }}
