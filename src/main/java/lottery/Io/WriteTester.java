package lottery.Io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {

    public static void main(String [] args) throws IOException {

        File jk = new File("C:\\jk");
        jk.mkdir();
        FileWriter fw = new FileWriter("C:\\jk\\output.txt");
        fw.write("一二三");
        fw.flush();
        fw.close();


    }


}
