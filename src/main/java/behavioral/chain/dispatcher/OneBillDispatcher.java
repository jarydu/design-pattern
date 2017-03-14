package behavioral.chain.dispatcher;

/**
 * Created by jarydu on 3/14/17.
 */
public class OneBillDispatcher implements CurrencyDispatcher {
    private CurrencyDispatcher nextDispatcher = null;
    private static final int PRIME = 1;

    @Override
    public void setNext(CurrencyDispatcher dispatcher) {
        this.nextDispatcher = dispatcher;
    }

    @Override
    public void dispatch(Currency currency) {

        int bill = currency.getValue() / PRIME;
        System.out.println("Dispensing [" + bill + "] 1 dollar bill");

        if (nextDispatcher != null) {
            nextDispatcher.dispatch(new Currency(currency.getValue() - bill * PRIME));
        }
    }
}
