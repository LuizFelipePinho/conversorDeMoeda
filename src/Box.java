import javax.swing.JOptionPane;

public class Box {

  private Verify verify;

  public Box() {
    this.verify = new Verify();
  }

  public double getInputValue(String message) {

    String valueInput = JOptionPane.showInputDialog(null, message);
    
    try {
      Boolean isNum = this.verify.isInteger(valueInput);

      while (!isNum) {
        this.showMessage("Digite somente numeros");
        valueInput = JOptionPane.showInputDialog(null, message);
        isNum = this.verify.isInteger(valueInput);
      }
  
      double valueConvert = Double.parseDouble(valueInput);
  
      return valueConvert;

    } catch(Exception e) {
      return 0.0;
    }
    

  }

  public String optionsConverteTo() {

    String[] options = { "Conversor de Moeda", "Conversor de Temperatura" };
    String messageOption = "Escolha uma opcao";
    String title = "Menu";
    String optionSelect = this.chooseOptions(options, messageOption, title);
    return optionSelect;

  }

  public String optionCoinSelected() {

    String[] options = { "De Reais a Dolares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
        "de Reais a Won Coreano", "De Dolares a Reais", "De Euros a reais", "De libras a Reais", "De Reais a Yenes",
        "De Won Coreano a Reais" };

    String messageOption = "Escolha a moeda para qual deseja converter";
    String title = "Moedas";

    String optionSelect = this.chooseOptions(options, messageOption, title);

    return optionSelect;

  }

  public String chooseOptions(String[] options, String messageOption, String title) {

    String optionSelect;
    try {
      optionSelect = JOptionPane.showInputDialog(null, messageOption, title, JOptionPane.PLAIN_MESSAGE,
          null, options, "Escolha").toString();
    } catch (Exception e) {
      return "Cancelado";
    }

    return optionSelect;
  }

  public void showMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  public void showMessageValueConvert(double value, String coin) {
    String valueConvert = Double.toString(value);
    String message = "O valor da convercao eh de " + valueConvert + " " + coin;
    this.showMessage(message);

  }

  public int keepConversion() {
    int valueOption = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Selecione uma opcao ", 1);
    return valueOption;
  }
}
