package sample;

import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;
import org.junit.Assert;
import org.junit.Test;

/**
 * 八字测试
 */
public class BaZiTest {

  @Test
  public void test1(){
    Solar solar = new Solar(2020,1,1,22,35,0);
    Lunar lunar = solar.getLunar();
    //[己亥, 丙子, 癸卯, 癸亥]
    System.out.println(lunar.getBaZi());
  }

  @Test
  public void test2(){
    Solar solar = new Solar(2020,1,6,14,35,0);
    Lunar lunar = solar.getLunar();
    //[己亥, 丁丑, 戊申, 己未]
    System.out.println(lunar.getBaZi());
  }

  @Test
  public void test3(){
    Solar solar = new Solar(2020,1,6,3,35,0);
    Lunar lunar = solar.getLunar();
    //[己亥, 丁丑, 戊辰, 癸亥]
    System.out.println(lunar.getBaZi());
  }

  @Test
  public void test4(){
    Solar solar = new Solar(2020,1,26,21,41,0);
    Lunar lunar = solar.getLunar();
    //[己亥, 丙子, 戊申, 甲寅]
    System.out.println(lunar.getBaZi());
  }

  @Test
  public void test5(){
    Solar solar = new Solar(2020,2,4,1,42,0);
    Lunar lunar = solar.getLunar();
    //[己亥, 丁丑, 丁丑, 辛丑]
    System.out.println(lunar.getBaZi());
  }

  @Test
  public void test6(){
    Solar solar = new Solar(2020,2,5,21,43,0);
    Lunar lunar = solar.getLunar();
    //[庚子, 戊寅, 戊寅, 癸亥]
    System.out.println(lunar.getBaZi());
  }

  @Test
  public void test7(){
    Solar solar = new Solar(2020,5,26,23,43,0);
    Lunar lunar = solar.getLunar();
    //[庚子, 辛巳, 庚午, 丙子]
    System.out.println(lunar.getBaZi());
  }

}
