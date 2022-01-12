public class Time{

  private int hour; 
  private int minute; 
  private int second; 


  public Time () 
  {
    setTime (0, 0, 0);
  }


  public Time (int hours, int minutes, int seconds) 
  {
    setTime (hours, minutes, seconds);
  }


  public void setTime (int hours, int minutes, int seconds) 
  {
    if (0 <= hours && hours < 24)
    {
      hour = hours;
    }
    else
    {
      hour = 0;
    }
    if (0 <= minutes && minutes < 60)
    {
      minute = minutes;
    }
    else
    {
      minute = 0;
    }
    if (0 <= seconds && seconds < 60)
    {
      second = seconds;
    }
    else
    {
      second = 0;
    }
  }


  public int getHours() 
  {
    return hour;
  }


  public int getMinutes() 
  {
    return minute;
  }


  public int getSeconds() 
  {
    return second;
  }


  public void addTime(Time secondTime)
  {
    this.second += secondTime.getSeconds();
    this.minute+= secondTime.getMinutes();
    this.minute+=(int)(this.second/60);
    this.second = this.second % 60;
    this.hour += secondTime.getHours();
    this.hour+=(int)(this.minute/60);
    this.minute= this.minute% 60;
    this.hour = this.hour%24;
  }


  public void tick()
  {
    this.second += 1;
    this.minute+=(int)(this.second/60);
    this.second = this.second % 60;
    this.hour+=(int)(this.minute/60);
    this.minute= this.minute% 60;
    this.hour = this.hour%24;
  }


  public void tickDown()
  {
    this.second -= 1;
    if(this.second <0)
    {
      this.second+=60;
      this.minute-=1;
    }
    if(this.minute<0)
    {
      this.minute+=60;
      this.hour-=1;
    }
    if(this.hour<0)
    {
      this.hour+=24;
    }
  }
}