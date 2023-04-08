package MainPackage.fileclassinjava;

import java.io.File;
import java.io.IOException;

public class RenameFiles {
    public static void main(String[] args) throws IOException {
        // first file created
        File newFile=new File("C:\\Users\\Public\\Sumit\\New folder\\FileName");
        newFile.createNewFile();
        // file rename
        File reName = new File("C:\\Users\\Public\\Sumit\\New folder\\FileRename");
        boolean trueOrFalse =newFile.renameTo(reName);//File Renamed
        if (trueOrFalse==true){ // Just to check Rename
            System.out.println("rename Successfull");
        }
    }
}
