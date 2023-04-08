package MainPackage.fileclassinjava;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\Public\\Sumit\\New folder\\note2022");

        int i;
        while ((i=file.read())!=-1)
            System.out.print((char)i);
        file.close();
    }}

