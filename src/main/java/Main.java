public class Main {
    public static void main(String[] args) {
        CSVReader reader = new CSVReader();
        ObjectToJSON objToJsn = new ObjectToJSON();
        objToJsn.objectToJson(reader.read("C:\\Users\\Tal\\Desktop\\Course\\madaReportsProject\\src\\main\\resources\\MadaReports.csv"));
    }
}
