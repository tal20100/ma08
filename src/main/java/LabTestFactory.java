import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LabTestFactory extends Factory {
    Date resultDate;
    Date birthDate;

    @Override
    public LabTest create(String[] record) {
        int idNum = Integer.parseInt(record[0]);
        int idType = Integer.parseInt(record[1]);
        String firstName = record[2];
        String lastName = record[3];
        try {
            resultDate = new SimpleDateFormat("dd/MM/yyyy").parse(record[4]);
            birthDate = new SimpleDateFormat("dd.MM.yyyy").parse(record[5]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String labCode = record[6];
        String stickerNumber = record[7];
        Result resultTestCorona = Result.resultFromString(record[8]);
        String variant = record[9];
        String testType = record[10];

        return new LabTest(idNum, idType, firstName, lastName, resultDate, birthDate, labCode, stickerNumber, resultTestCorona, variant, testType);
    }
}

