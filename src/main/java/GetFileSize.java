import java.io.File;

public class GetFileSize {
    /**This function returns file size in kilobytes*/
    public long getFileSize(String pathStr) {
        File file = new File(pathStr);
        long bytes = 0;
        bytes = file.length();
        return bytes/1024;
    }
}
