package ch06;

public class ConstructorTest {

    public static void main(String[] args) {
        Clock c = new Clock(10, 55, 16);
        c.printTime();
    }


}

class Clock
{
    int hour;
    int min;
    int sec;

    public Clock(int h, int m, int s)
    {
        hour = h;
        min = m;
        sec = s;
    }

    public void printTime(){
        System.out.println(hour + ":" + min + ":"+ sec );
    }
}
