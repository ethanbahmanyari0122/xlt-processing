import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import java.io.File;
import java.io.IOException;


public class Unzip {

    public static void unzip(String source, String destination) throws IOException, ZipException {

        //String source = zipf.getAbsolutePath();//"some/compressed/file.zip";
        //String destination = baseDir.getPath();//"some/destination/folder";
        try {
            ZipFile zipFile = new ZipFile(source);
            zipFile.extractAll(destination);
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }
}