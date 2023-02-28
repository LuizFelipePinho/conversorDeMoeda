public class PerformConversion {

  Box box = new Box();
  CalculatorCoin calculatorCoin = new CalculatorCoin();
  CurrencyPrice currencyPrice = new CurrencyPrice();

  public void realToShow(double quotation, String coin) {
    calculatorCoin.setValueCoinCurrent(quotation);
    double result = calculatorCoin.convertCurrencyRealTo();
    box.showMessageValueConvert(result, coin);
  }


  public void coinToRealShow(double quotation ) {
    calculatorCoin.setValueCoinCurrent(quotation);
    double result = calculatorCoin.convertCurrencyToReal();
    box.showMessageValueConvert(result, "Reais");

  }
  
}
