class CalcTime{
    private int hour;
    private int minute;
    private int second;

    public CalcTime(){
        this(0,0,0);
    }

    public CalcTime(int hour, int minute, int second){
       this.hour =((hour >= 0 && hour <24) ? hour : 0 );
       this.minute =((minute >= 0 && minute <60) ? minute : 0 );
       this.second =((second >= 0 && second <60) ? second : 0 );
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }

}


public class Time {
    public static void main(String[] args){
        CalcTime ct1 = new CalcTime();
        CalcTime ct2 = new CalcTime(10,69,79);
        CalcTime ct3 = new CalcTime(10,20,45);
        System.out.println(ct1);
        System.out.println(ct2);
        System.out.println(ct3);
    }
}
