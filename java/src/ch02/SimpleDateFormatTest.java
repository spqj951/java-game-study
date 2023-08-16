package ch02;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatTest {

    public static void main(String[] args){
        Date  today = new Date();

        SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");


        System.out.println(dateForm.format(today));

    }
}
