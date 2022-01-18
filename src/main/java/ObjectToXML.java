import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import static junit.framework.Assert.assertNotNull;

public class ObjectToXML {
    final int maxObjectsPerFile = 50000;

    public void objectToXML(ArrayList<Object> objects) throws IOException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        int fileCount = 1;
        int objectCount = 0;
        String path = "C:\\Users\\Tal\\Desktop\\Course\\LABTESTS\\LABTESTS";
        String fileName = "file";
        String fileType = ".xml";
        File file =  new File(path+fileName+fileType);
        XmlMapper xmlMapper = (XmlMapper) new XmlMapper().setDateFormat(df);

        for(Object currentObj : objects){
            if(objectCount % maxObjectsPerFile == 0){ //Creating a new file
                fileName = "file" + fileCount;
                file = new File(path+fileName+fileType);
                fileCount++;
            }
            try {
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw);
                xmlMapper.writerWithDefaultPrettyPrinter().writeValue(out, currentObj);
                //xmlMapper.writeValue(out, currentObj);
                out.close();
                objectCount++;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
