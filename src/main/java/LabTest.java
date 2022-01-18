import java.util.Date;

public class LabTest {
    private int IDNum;
    private int IDType;
    private String firstName;
    private String lastName;
    private Date resultDate;
    private Date birthDate;
    private String labCode;
    private String stickerNumber;
    private int resultTestCorona;
    private String variant;
    private String testType;
    private Date join_date;
    private int health_care_id;
    private String health_care_name;

    public LabTest(int IDNum, int IDType, String firstName, String lastName, Date resultDate, Date birthDate, String labCode, String stickerNumber, int resultTestCorona, String variant, String testType, Date join_date, int health_care_id, String health_care_name) {
        this.IDNum = IDNum;
        this.IDType = IDType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.resultDate = resultDate;
        this.birthDate = birthDate;
        this.labCode = labCode;
        this.stickerNumber = stickerNumber;
        this.resultTestCorona = resultTestCorona;
        this.variant = variant;
        this.testType = testType;
        this.join_date = join_date;
        this.health_care_id = health_care_id;
        this.health_care_name = health_care_name;
    }

    public int getIDNum() {
        return IDNum;
    }

    public int getIDType() {
        return IDType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getResultDate() {
        return resultDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getLabCode() {
        return labCode;
    }

    public String getStickerNumber() {
        return stickerNumber;
    }

    public int getResultTestCorona() {
        return resultTestCorona;
    }

    public String getVariant() {
        return variant;
    }

    public String getTestType() {
        return testType;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public int getHealth_care_id() {
        return health_care_id;
    }

    public String getHealth_care_name() {
        return health_care_name;
    }
}
