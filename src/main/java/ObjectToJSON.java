import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ObjectToJSON {

    final int maxObjectsPerFile = 50000;

    public void objectToJson(ArrayList<Object> objects){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        int fileCount = 1;
        int objectCount = 0;
        String path = "C:\\Users\\Tal\\Desktop\\Course\\madaReportsProject\\src\\test\\java";
        String fileName = "file";
        String fileType = ".json";
        ObjectMapper objectMapper = new ObjectMapper();
        File file =  new File(path+fileName+fileType);
        for(Object currentObj : objects){
            if(fileCount % maxObjectsPerFile == 0){ //Creating a new file
                fileName = "file" + fileCount;
                file = new File(path+fileName+fileType);
                fileCount++;
            }

            try {
                objectMapper.setDateFormat(df);
                objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, currentObj);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
