package part_1.ex_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class ex1_naive {
    public static void main(String[] argv) throws IOException {
        String filename = argv[0];
        File file = new File(filename);
        byte[] buffer = new byte[10];
        int size = new FileInputStream(file).read(buffer);
        String content = new String(buffer,0,size);
        int number = Integer.parseInt(content);
        System.out.printf("%d * %d = %d\n", number,number,number*number);
        System.exit(0);
    }
}
