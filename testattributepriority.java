package testNG;

import org.testng.annotations.Test;

public class testattributepriority {
  @Test(priority=0)
  public void e() {
  }
  @Test
  public void c() {
  }
  @Test(alwaysRun=true)
  public void a() {
  }
  @Test(priority=1,enabled=false)
  public void f() {
  }
}
