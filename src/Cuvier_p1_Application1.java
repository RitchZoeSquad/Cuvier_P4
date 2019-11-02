import java.io.IOException;

public class Cuvier_p1_Application1 {
    public static void main(String[] args) throws IOException {
        Cuvier_p1 duplicateRemover = new Cuvier_p1();
        duplicateRemover.remove("problem1.txt");
        duplicateRemover.write("unique_words.txt");
    }
}
