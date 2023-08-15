package ch03;
import java.io.*;
public class KeyBoardTest {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader in = new BufferedReader(isr);

        String str;
        System.out.println("글씨를 입력하면 따라합니다");
        str = in.readLine();
        System.out.println(str);
    }
}
