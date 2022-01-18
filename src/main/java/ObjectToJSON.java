import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ObjectToJSON implements ObjectToFile{

    final int maxObjectsPerFile = 50000;

    public void mapObject(ArrayList<Object> objects) throws IOException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        int fileCount = 1;
        int objectCount = 0;
        String path = "C:\\Users\\Tal\\Desktop\\Course\\LABTESTS\\LABTESTS";
        String fileName = "file";
        String fileType = ".json";
        ObjectMapper objectMapper = new ObjectMapper().setDateFormat(df);
        File file =  new File(path+fileName+fileType);
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
                objectMapper.writerWithDefaultPrettyPrinter().writeValue(out, currentObj);
                out.close();
                objectCount++;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}