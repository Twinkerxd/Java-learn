import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Junk\\Projects\\Java-learn\\src\\Data");
        Scanner scanner = new Scanner(file);

        ArrayList<String> requests = new ArrayList<>();

        while (scanner.hasNextLine()) {
            requests.add(scanner.nextLine());
        }

        for (String request : requests) {
            System.out.println("---------");
            System.out.println(request);
        }
    }
}
