import java.util.HashMap;
import java.util.Map;

public class FactoriesMap {

    public Factory factoryMap(String objectName){
        Map<String,Factory> factoryMap = new HashMap<>();
        ReportFactory reportFactory = new ReportFactory();
        LabTestFactory labTestFactory = new LabTestFactory();
        factoryMap.put("Report", reportFactory);
        factoryMap.put("LabTest", labTestFactory);

        return factoryMap.get(objectName);
    }
}
