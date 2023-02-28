public class Main {

  public static void main(String[] args) {

    PerformConversion performConversion = new PerformConversion();

    int keepOptionSelectd = 0;

    while (keepOptionSelectd == 0) {

      String optionConvertSelected = performConversion.box.optionsConverteTo();

      if (optionConvertSelected == "Conversor de Moeda") {
        double valueInput = performConversion.box.getInputValue("Digite um valor");
        performConversion.calculatorCoin.setValueCoinToConvert(valueInput);

        String optionCoinSelected = performConversion.box.optionCoinSelected();

        if (optionCoinSelected == "De Reais a Dolares") {
          performConversion.realToShow(performConversion.currencyPrice.getDollar());

        } else if (optionCoinSelected == "De Reais a Euros") {
          performConversion.realToShow(performConversion.currencyPrice.getEuros());

        } else if (optionCoinSelected == "De Reais a Libras") {
          performConversion.realToShow(performConversion.currencyPrice.getLibra());

        } else if (optionCoinSelected == "De Reais a Yenes") {
          performConversion.realToShow(performConversion.currencyPrice.getIenes());

        } else if (optionCoinSelected == "de Reais a Won Coreano") {
          performConversion.realToShow(performConversion.currencyPrice.getWonCoreano());

        } else if (optionCoinSelected == "De Dolares a Reais") {
          performConversion.coinToRealShow(performConversion.currencyPrice.getDollar());

        } else if (optionCoinSelected == "De Euros a reais") {
          performConversion.coinToRealShow(performConversion.currencyPrice.getEuros());

        } else if (optionCoinSelected == "De libras a Reais") {
          performConversion.coinToRealShow(performConversion.currencyPrice.getLibra());

        } else if (optionCoinSelected == "De Reais a Yenes") {
          performConversion.coinToRealShow(performConversion.currencyPrice.getIenes());

        } else if (optionCoinSelected == "De Won Coreano a Reais") {
          performConversion.coinToRealShow(performConversion.currencyPrice.getWonCoreano());

        }

        keepOptionSelectd = performConversion.box.keepConversion();
      }

    }

  }
}
