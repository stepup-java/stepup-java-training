package assignments.student_submissions.DevSquadX.Yash_Borekar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileHandling  {
    public static void main() throws IOException {
        Path filePath = Paths.get("sample.txt");
        Files.createFile(filePath);
        String data= "Hello, this is a sample text file.\nWelcome to File Handling in Java.";
        Files.write(filePath,data.getBytes());

        String fileData = Files.readString(filePath);
        System.out.println(fileData);

        String newData = "This is the appended line.";
        Files.write(filePath,newData.getBytes(), StandardOpenOption.APPEND);

        String updatedFileData = Files.readString(filePath);
        System.out.println(updatedFileData);



    }
}
