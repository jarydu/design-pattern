package behavioral.chain.dispatcher;

/**
 * Created by jarydu on 3/14/17.
 */
public class ATMDispatcher implements CurrencyDispatcher {
    private CurrencyDispatcher nextDispatcher = null;

    @Override
    public void setNext(CurrencyDispatcher dispatcher) {
        this.nextDispatcher = dispatcher;
    }

    @Override
    public void dispatch(Currency currency) {
        System.out.println("ATM dispensing bills[" + currency.getValue() + "] =>");
        nextDispatcher.dispatch(new Currency(currency.getValue()));
    }

    public static void main(String[] args) {
        CurrencyDispatcher atm = new ATMDispatcher();
        CurrencyDispatcher hundred = new HundredBillDispatcher();
        CurrencyDispatcher fifty = new FiftyBillDispatcher();
        CurrencyDispatcher twenty = new TwentyBillDispatcher();
        CurrencyDispatcher ten = new TenBillDispatcher();
        CurrencyDispatcher two = new TwoBillDispatcher();
        CurrencyDispatcher one = new OneBillDispatcher();

        atm.setNext(hundred);
        hundred.setNext(fifty);
        fifty.setNext(twenty);
        twenty.setNext(ten);
        ten.setNext(two);
        two.setNext(one);

        atm.dispatch(new Currency(7234));
    }
}
