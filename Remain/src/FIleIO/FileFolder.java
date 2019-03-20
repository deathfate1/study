package FIleIO;

/**
 * @author Oskolkov Vlad
 * @version 13.03.19
 */

import java.io.File;

public class FileFolder {
    public static void main(String[] args) {

        File file = new File("/home/deathfate/Документы");

        String[] pathes = file.list();

        for (String path : pathes){
            System.out.println(path);
        }

        String dir = "/home/deathfate/Документы/lol/lo/l";
        File f = new File(dir);
        f.mkdirs();
    }
}
