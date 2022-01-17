import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Report {
    private String MDACODE;
    private int idNum;
    private int idType;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private int buildingNumber;
    private String barcode;
    private Date getDate;
    private Date takeDate;
    private Date resultDate;

    public Report(String MDACODE, int idNum, int idType, String firstName, String lastName, String city, String street,
                  int buildingNumber, String barcode, Date getDate, Date takeDate, Date resultDate) {
        this.MDACODE = MDACODE;
        this.idNum = idNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.barcode = barcode;
        this.getDate = getDate;
        this.takeDate = takeDate;
        this.resultDate = resultDate;
    }

    public String getMDACODE() {
        return MDACODE;
    }

    public int getIdNum() {
        return idNum;
    }

    public int getIdType() {
        return idType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public String getBarcode() {
        return barcode;
    }

    public Date getGetDate() {
        return getDate;
    }

    public Date getTakeDate() {
        return takeDate;
    }

    public Date getResultDate() {
        return resultDate;
    }
}
