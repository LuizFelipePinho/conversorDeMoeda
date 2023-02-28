public class Verify {

  public boolean isInteger(String str) {
    if( str.isEmpty()  ) {
      return false; 
    }

    return str.matches("[+-]?\\d*(\\.\\d+)?");
  }

  
}
