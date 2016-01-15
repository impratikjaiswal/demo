package org.whl.nio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacter {

    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        
        try {
            in = new FileReader("D:/test/test.txt");
            out = new FileWriter("D:/test/outTest.txt");
            
            int c;
            while ( (c = in.read()) != -1 ) {
                out.write(c);
            }
            
            System.out.println("It is done...");
        } finally {
            if (in != null) {
                in.close();
            }
            
            if (out != null) {
                out.close();
            }
        }

    }

}
