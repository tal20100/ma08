import java.util.HashMap;
import java.util.Map;

public class FactoriesMap {

    public Factory factoryMap(String objectName){
        Map<String,Factory> factoryMap = new HashMap<>();
        ReportFactory reportFactory = new ReportFactory();
        factoryMap.put("Report", reportFactory);

        return factoryMap.get(objectName);
    }
}
