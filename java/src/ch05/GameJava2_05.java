package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameJava2_05 {

    public static int playGame() throws IOException{
        int x, y, z;
        Random r = new Random();
        x = Math.abs(r.nextInt() % 9) + 1;

        do {
            y = Math.abs(r.nextInt() % 9) +1;
        } while( y == x);

        do {
            z = Math.abs(r.nextInt() % 9) + 1;

        }while (z == x || z == y);

        System.out.println(x + ", " + y + ", " + z);

        return playGame(x, y, z);
    }

    public static int playGame(int x, int y, int z) throws IOException {
        int count;
        int strike, ball;

        int[] usr = new int[3];
        int[] com = {x, y, z};

        System.out.println("숫자 야구 게임");

        count = 0;

        do {

            count++;

            do {
                System.out.println("\n카운트 : " + count);

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String user;

                System.out.println("1번째 숫자: ");
                user = br.readLine();
                usr[0] = Integer.parseInt(user);

                System.out.println("2번째 숫자 : ");
                user = br.readLine();
                usr[1] = new Integer(user).intValue();

                System.out.println("3번째 숫자: ");
                user = br.readLine();
                usr[2] = Integer.valueOf(user).intValue();

                if (usr[0] == 0 || usr[1] == 0 || usr[2] == 0) {
                    System.out.println("0은 노노");
                } else if (usr[0] > 9 || usr[1] > 9 || usr[2] > 9) {
                    System.out.println("1~9까지만 쓰라 마!");

                } else if (usr[0] == usr[1] || usr[1] == usr[2] || usr[2] == usr[0]) {
                    System.out.println("같은 숫자 노노!");

                }
            } while (usr[0] == 0 || usr[1] == 0 || usr[2] == 0 || usr[0] > 9 || usr[1] > 9 || usr[2] > 9 ||
                    usr[0] == usr[1] || usr[1] == usr[2] || usr[2] == usr[0]);


            strike = ball = 0;

            if (usr[0] == com[0]) {
                strike++;
            } else ball++;
            if (usr[1] == com[1]) strike++;
            else ball++;
            if (usr[2] == com[2]) strike++;
            else ball++;

            System.out.println("Strike: " + strike + " Ball: " + ball);


        } while (strike < 3 && count < 11);
        return count;
    }
    public static void main(String[] args) throws IOException {
        int result;

        if (args.length == 3) {
            int x = Integer.valueOf(args[0]).intValue();
            int y = new Integer(args[1]).intValue();
            int z = Integer.parseInt(args[2]);

            result = playGame(x, y, z);
        } else result = playGame();

        System.out.println();
        if(result <= 2){
            System.out.println("참 잘함");
        } else if (result <= 5) {
            System.out.println("구웃");

        } else if (result <= 9) {
            System.out.println("쏘쏘");
        } else System.out.println("헤타쿠쏘");
    }


}

