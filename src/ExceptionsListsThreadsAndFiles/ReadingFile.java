package ExceptionsListsThreadsAndFiles;

import java.util.Scanner;
import java.io.File;

public class ReadingFile {
    public static void main(String[] args) {
        try {
            File f = new File("a.txt");
            Scanner sc = new Scanner(f);

            while(sc.hasNext()) {
                String a = sc.next();
                String b = sc.next();
                System.out.println(a + " " + b);
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Eror");
        }
    }


}
