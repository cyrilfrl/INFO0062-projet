import java.io.*;
import java.util.Vector;

public class FileReader {
    // Variables
    private String filePath;
    private Vector<String> fileLines;

    // Constructor
    public FileReader(String filePath) {
        this.filePath = filePath;
        this.fileLines = new Vector<>();
    }

    // Methods
    public Vector<String> readFile() {
        this.fileLines = new Vector<>();

        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                fileLines.addElement(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return fileLines;
    }
}
