import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Properties p = new Properties();
        try {
            InputStream inputStream = new FileInputStream("C:\\Users\\Tal\\Desktop\\Course\\madaReportsProject\\src\\main\\resources\\sources.properties");
            p.load(inputStream);
            CSVReader reader = new CSVReader();
            ObjectToJSON objToJsn = new ObjectToJSON();
            ObjectToXML objectToXML = new ObjectToXML();
            String labTestPath = p.getProperty("labTestPath");
            String reportsPath = p.getProperty("reportsPath");
            objToJsn.mapObject(reader.read(labTestPath, "LabTest"));
            objectToXML.mapObject(reader.read(labTestPath, "LabTest"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
