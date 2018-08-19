package testNG;

import org.testng.annotations.Test;

public class TestGrouping2 {
  @Test(groups={"A"})
  public void g1() {
  }
  @Test(groups={"B"})
  public void g2() {
  }
  @Test(groups={"B"})
  public void g3() {
  }
  @Test(groups={"C"})
  public void g4() {
  }
}
