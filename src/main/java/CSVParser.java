import java.io.*;
import java.util.*;

public class CSVParser {

    /**Merging two CSV files into one with no repetitive values, the new file will be saved as mergedFile.csv,
     * ill create objects ArrayList from the file and use my ObjectToJSON class*/

/*
    public static List<String> getHeadersFromACsv(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<String> headers = null;

        String line = null;
        while ((line = br.readLine()) != null) {
            String[] lineSplit = line.split(",");
            headers = new ArrayList<>(Arrays.asList(lineSplit));
            break;
        }

        br.close();

        return headers;
    }

    public static void writeToCsv(final File file, final Set<String> headers, final List<CrossedObject> records)
            throws IOException {
        FileWriter csvWriter = new FileWriter(file);

        // write headers
        String sep = "";
        String[] headersArr = headers.toArray(new String[headers.size()]);
        for (String header : headersArr) {
            csvWriter.append(sep);
            csvWriter.append(header);
            sep = ",";
        }

        csvWriter.append("\n");

        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\Tal\\Desktop\\Course\\madaReportsProject\\src\\main\\resources\\mergedFile.csv"), ',');
        // feed in your array (or convert your data to an array)
        writer.writeNext(deviceUser.toArray());
        writer.close();
        for (CrossedObject record : records) {
            sep = "";
            for (int i = 0; i < headersArr.length; i++) {
                csvWriter.append(sep);
                csvWriter.append(record.get(headersArr[i]));
                sep = ",";
            }
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();
    }*/
}
