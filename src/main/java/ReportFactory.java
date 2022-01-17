import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ReportFactory extends Factory {
    Date getDate;
    Date takeDate;
    Date resultDate;

    public Report create(String[] record) {
        String mdaCode = record[0];
        int idNum = Integer.parseInt(record[1]);
        int idType = Integer.parseInt(record[2]);
        String firstName = record[3];
        String lastName = record[4];
        String city = record[5];
        String street = record[6];
        int buildingNumber = Integer.parseInt(record[7]);
        String barcode = record[8];
        try {
            getDate = new SimpleDateFormat("dd.MM.yyyy").parse(record[9]);
            takeDate = new SimpleDateFormat("dd.MM.yyyy").parse(record[10]);
            resultDate = new SimpleDateFormat("dd/MM/yyyy").parse(record[11]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Report(mdaCode, idNum, idType, firstName, lastName, city, street, buildingNumber, barcode, getDate, takeDate, resultDate);
    }
}
