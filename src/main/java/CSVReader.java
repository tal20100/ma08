import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVReader implements Reader {

    @Override
    public ArrayList<Object> read(String path) {
        ArrayList<Object> objectsArr = new ArrayList<>();
        File file = new File(path);

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = null;
            br.readLine(); //skip the first line
            while ((line = br.readLine()) != null) {
                    String[] record = line.split(",");

                    FactoriesMap fm = new FactoriesMap();
                    Object object = fm.factoryMap("Report").create(record);
                    objectsArr.add(object);
                line = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objectsArr;
    }
}


