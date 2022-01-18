import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CSVReader reader = new CSVReader();
        ObjectToJSON objToJsn = new ObjectToJSON();
        ObjectToXML objectToXML = new ObjectToXML();
        try{
            objToJsn.mapObject(reader.read("C:\\Users\\Tal\\Desktop\\Course\\madaReportsProject\\src\\main\\resources\\MadaReports.csv","Report"));
            objectToXML.mapObject(reader.read("C:\\Users\\Tal\\Desktop\\Course\\madaReportsProject\\src\\main\\resources\\LabTests.csv", "LabTest"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
