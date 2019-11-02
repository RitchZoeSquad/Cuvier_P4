import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cuvier_p1 {
    private Set<String> uniqueWords = new HashSet<>();

    public void remove(String dataFile) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(dataFile));
        while (sc.hasNext()) {
            String word = sc.next();
            uniqueWords.add(word);
        }
        sc.close();
    }

    public void write(String outputFile) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        for (String word: uniqueWords) {
            writer.write(word);
            writer.write("\n");
        }
        writer.close();
    }
}
