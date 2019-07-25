import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        CountingNumbers countingNumbers = new CountingNumbers();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter some text: ");
        String text = reader.readLine();
        System.out.println("The text " + text + " contains " + countingNumbers.countNumbers(text) + "characters.");
    }
}
