package org.whl.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try {
            in = new FileInputStream("D:/test/test.txt");
            out = new FileOutputStream("D:/test/outTest.txt");
            int c;
            while (( c = in.read() ) != -1) {
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
