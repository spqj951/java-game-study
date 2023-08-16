package ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuGuDan {

    public static void main(String[] args) throws IOException {
        int x, y;
        Random r = new Random();

        if(args.length == 1){
            x = Integer.valueOf(args[0]).intValue();

        } else{
            x = Math.abs(r.nextInt() % 9) + 1;
        }

        y = Math.abs(r.nextInt() % 9) +1;

        int num = x*y;

        System.out.println();
        System.out.println("* 구구단 " + x + "단에 대한 문제입니다");
        System.out.println();

        System.out.print(x + " * " + y +" = ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String user;
        user = br.readLine();

        int inputNum = Integer.valueOf(user).intValue();

        if(num == inputNum){
            System.out.println("맞았당");
        } else {
            System.out.println("틀렸습니다. 정답은 " + num + " 입니다.");
        }
    }
}
