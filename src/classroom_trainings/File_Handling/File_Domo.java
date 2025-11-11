package classroom_trainings.File_Handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class File_Domo {
    public static void  main(String[] args)throws IOException {
        Path filepath= Paths.get("demotextfile.txt");

        //create file
        Files.createFile(filepath);
        String data="Write this in the file \n this is second line";
        Files.write(filepath,data.getBytes());
        String fileData= Files.readString(filepath);
        System.out.println(fileData);
        String dataToUpdate="This will be updated at the end";
        Files.write(filepath,dataToUpdate.getBytes(), StandardOpenOption.APPEND);
        Files.delete(filepath);
        String UpdateData=Files.readString(filepath);
        System.out.println(UpdateData);


    }

}
