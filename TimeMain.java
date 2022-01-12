public class Main{
  public static void main(String[]  args)
  {
    Time Time1 = new Time(2,4,7);
    Time Time2 = new Time(8,26,57);
    Time1.tick();
    int newSeconds = Time1.getSeconds();
    

    Time2.tickDown();
    newSeconds = Time1.getSeconds();
    

    Time1.addTime(Time2);
    
    int newHour = Time1.getHours();
    int newMinute = Time1.getMinutes();
    newSeconds = Time1.getSeconds();
    
  }
}