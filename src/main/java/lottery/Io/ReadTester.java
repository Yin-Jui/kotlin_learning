package lottery.Io;

import java.io.*;

public class ReadTester {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader((new FileReader("data.txt")));
            String line = br.readLine();
            while (line!=null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //readChi();
        //ReadEng();
    }

    private static void readChi() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while (n!=-1) {

                System.out.println((char)n);
                n = fr.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ReadEng() {
        File file = new File("data.txt");
        System.out.println(file.getAbsolutePath());
        try {
            InputStream is = new FileInputStream(file);
            int n = is.read();
            while (n!=-1){
                System.out.println((char) n);
                n = is.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
