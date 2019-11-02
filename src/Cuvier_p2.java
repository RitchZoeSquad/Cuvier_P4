import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cuvier_p2 {

    private Map<String, Integer> wordCounter = new HashMap<>();

    public void count(String dataFile) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(dataFile));
        while (sc.hasNext()) {
            String word = sc.next();
            wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);
        }
        sc.close();
    }

    public void write(String outputFile) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        for (Map.Entry<String, Integer> wordCount : wordCounter.entrySet()) {
            writer.write(wordCount.getKey() + " : " + wordCount.getValue());
            writer.write("\n");
        }
        writer.close();
    }
}
