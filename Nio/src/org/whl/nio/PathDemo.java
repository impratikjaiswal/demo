package org.whl.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {


    public static void main(String[] args) throws IOException {
        Path file = Paths.get("D:/test/test.txt");
        if (Files.exists(file, LinkOption.NOFOLLOW_LINKS)) {
            System.out.println("File has existed...");
        } else {
            Files.createDirectory(file.getParent());
            Files.createFile(file);
            System.out.println("Create new file...");
        }
        
        Path outFile = Paths.get("D:/test/outTest.txt");
        if (Files.exists(outFile, LinkOption.NOFOLLOW_LINKS)) {
            System.out.println("Output file has already existed in disk...");
            
        } else {
            Files.createFile(outFile);
            System.out.println("Create new output file...");
        }
        
        
    }

}
