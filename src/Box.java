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

  public String optionsConverteTo() {

    String[] options = { "Conversor de Moeda", "Conversor de Temperatura" };
    String messageOption = "Escolha uma opcao";
    String title = "Menu";
    String optionSelect;
    
    try {
      optionSelect = JOptionPane.showInputDialog(null, messageOption, title, JOptionPane.PLAIN_MESSAGE,
          null, options, "Escolha").toString();
    } catch (Exception e) {
      return "Cancelado";
    }

    return optionSelect;

  }

}
