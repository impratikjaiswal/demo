package org.whl.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLines {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:/test/test.txt");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        for (String l : lines) {
            System.out.println(l);
        }
    }

}
