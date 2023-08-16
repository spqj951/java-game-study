package ch03;

import java.util.*;
import java.io.*;
public class GameJava2_03 {

    public static void main(String[] args) throws IOException {
        Random r = new Random();

        int computer = Math.abs(r.nextInt() % 3);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String user;
        System.out.println("가위, 바위, 보 중 하나를 선택하세요.(가위 = a, 바위 = b, 보 = c)");

        user = br.readLine();

        if (user.equals("a")) {
            if(computer == 0) System.out.println("무승부");
            if(computer==1 ) System.out.println("컴퓨터 승!");
            if(computer ==2) System.out.println("사람 승!");

        } else if (user.equals("b")) {
            if(computer == 0) System.out.println("사람 승!");
            if(computer == 1) System.out.println("무승부");
            if(computer == 2) System.out.println("컴퓨터 승!");

        } else if (user.equals("c")) {
            if(computer == 0) System.out.println("컴퓨터 승!");
            if(computer == 1) System.out.println("사람 승!");
            if(computer == 2) System.out.println("무승부");
        }


    }
}
