import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {
    public static void readCSV(String filename, StudentLinkedList list) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String name = values[0];
                String course = values[1];
                int credit = Integer.parseInt(values[2]);
                double grade = Double.parseDouble(values[3]);
                double cgpa = Double.parseDouble(values[4]);
                list.addLast(name, course, credit, grade, cgpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
