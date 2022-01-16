import java.time.LocalDate;

public class Report {
    private String MDACODE;
    private int idNum;
    private int idType;
    private String firstName;
    private String lastName;
    private String city;
    private String Street;
    private int buildingNumber;
    private String barcode;
    private LocalDate getDate;
    private LocalDate TakeDate;
    private LocalDate ResultDate;

    public Report(String MDACODE, int idNum, int idType, String firstName, String lastName, String city, String street,
                  int buildingNumber, String barcode, LocalDate getDate, LocalDate takeDate, LocalDate resultDate) {
        this.MDACODE = MDACODE;
        this.idNum = idNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        Street = street;
        this.buildingNumber = buildingNumber;
        this.barcode = barcode;
        this.getDate = getDate;
        TakeDate = takeDate;
        ResultDate = resultDate;
    }
}
