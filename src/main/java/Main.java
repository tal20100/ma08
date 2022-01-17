import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CSVReader reader = new CSVReader();
        ObjectToJSON objToJsn = new ObjectToJSON();
        try{
            objToJsn.objectToJson(reader.read("C:\\Users\\Tal\\Desktop\\Course\\madaReportsProject\\src\\main\\resources\\MadaReports.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
