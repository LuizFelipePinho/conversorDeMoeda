import javax.swing.JOptionPane;

public class Box {

  private Verify verify;

  public Box() {
    this.verify = new Verify();
  }

  public double GetInputValue(String message) {

    String valueInput = JOptionPane.showInputDialog(null, message);

    Boolean isNum = this.verify.isInteger(valueInput);

    while (!isNum) {
      JOptionPane.showMessageDialog(null, "Digite somente numeros");
      valueInput = JOptionPane.showInputDialog(null, message);
      isNum = this.verify.isInteger(valueInput);
    }

    double valueConvert = Double.parseDouble(valueInput);

    return valueConvert;

  }

}
