import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatorCoin {

  private double valueCoinToConvert;
  private double valueCoinCurrent;
  private double valueConverted;

  public double getValueCoinToConvert() {
    return valueCoinToConvert;
  }

  public double getValueCoinCurrent() {
    return valueCoinCurrent;
  }

  public double getvalueConverted() {
    return valueConverted;
  }

  public void setValueCoinToConvert(double valueCoinToConvert) {

    this.valueCoinToConvert = valueCoinToConvert;
  }

  public void setValueCoinCurrent(double valueCoinCurrent) {
    this.valueCoinCurrent = valueCoinCurrent;
  }

  public void setvalueConverted(double valueConverted) {
    this.valueConverted = valueConverted;
  }

  // 10 reias para dollar = 10 / cotaçãoatualDollar
  public double convertCurrencyRealTo() {
    double result = this.getValueCoinToConvert() / this.getValueCoinCurrent();
    BigDecimal bg = new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN);
    this.setvalueConverted(bg.doubleValue());
    return bg.doubleValue();

  }

  // 1,92 dollar para reais = 1,92 * cotacaoAtualDollar
  public double convertCurrencyToReal() {
    double result = this.getValueCoinToConvert() * this.getValueCoinCurrent();
    BigDecimal bg = new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN);
    this.setvalueConverted(bg.doubleValue());
    return bg.doubleValue();

  }

}
