import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;



public class UserInputInterface implements UserInput {

    public Scanner input;
    public UserInputInterface(InputStream inputStream) {
        input = new Scanner(inputStream);
    }

    public UserInputInterface(String inputStream) {
        input = new Scanner(new ByteArrayInputStream(inputStream.getBytes()));
    }

    public String getNextInput() {
        return input.next();
    }
}
