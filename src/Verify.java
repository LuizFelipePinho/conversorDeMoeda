public class Verify {

  public boolean isInteger(String str) {
    if(str.length() <= 0) {
      return false; 
    }

    return str.matches("[+-]?\\d*(\\.\\d+)?");
  }
}
