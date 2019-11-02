import java.io.IOException;

public class Cuvier_p2_Application2 {
    public static void main(String[] args) throws IOException {
        Cuvier_p2 duplicateCounter = new Cuvier_p2();
        duplicateCounter.count("problem2.txt");
        duplicateCounter.write("unique_word_counts.txt");
    }
}
