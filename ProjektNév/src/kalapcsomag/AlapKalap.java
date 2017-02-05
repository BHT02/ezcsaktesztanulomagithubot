package kalapcsomag;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Nigel-727 (on win10.desktop)
 */
public class AlapKalap {
  GregorianCalendar dátum;
  private AlapKalap() {
    this.dátum = new GregorianCalendar();
    this.dátum.setTime(new Date());
  }
  public void showDateOfCreation() {
    int year = this.dátum.get(GregorianCalendar.YEAR);
    int month = this.dátum.get(GregorianCalendar.MONTH+1);
    int day = this.dátum.get(GregorianCalendar.DAY_OF_MONTH);
    System.out.println(year+"/"+month+"/"+day);
  }
}