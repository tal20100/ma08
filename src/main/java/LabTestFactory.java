import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class LabTestFactory extends Factory {
    Date resultDate;
    Date birthDate;

    @Override
    public LabTest create(String[] record) throws InvalidIdException {
        int idNum = Integer.parseInt(record[0]);
        int idType = Integer.parseInt(record[1]);
        String firstName = record[2];
        String lastName = record[3];
        try {
            resultDate = new SimpleDateFormat("dd/MM/yyyy").parse(record[4]);
            birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(record[5]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String labCode = record[6];
        String stickerNumber = record[7];
        int resultTestCorona = Integer.parseInt(record[8]);
        String variant = record[9];
        String testType = record[10];
        HealthCareInfoProvider healthCareInfoProvider = new HealthCareInfoProvider();
        Date join_date = null;
        int health_care_id = 0;
        String health_care_name = null;
        try {
            PersonInsured person = healthCareInfoProvider.fetchInfo(idNum, idType);
            join_date = convertToDateViaSqlDate(person.getJoinDate()); //exception
            health_care_id = person.getHealthCareId();
            health_care_name = person.getHealthCareName();
        } catch (InvalidIdException e) {
            e.printStackTrace();
        }
            return new LabTest(idNum, idType, firstName, lastName, resultDate, birthDate, labCode, stickerNumber, resultTestCorona, variant, testType, join_date, health_care_id, health_care_name);
    }

    public Date convertToDateViaSqlDate(LocalDate dateToConvert) {
        return java.sql.Date.valueOf(dateToConvert);
    }

    private static int getLength(int num) {
        int count = 1;
        while (num >= 10) {
            num = num / 10;
            count++;
        }
        return count;
    }
}

