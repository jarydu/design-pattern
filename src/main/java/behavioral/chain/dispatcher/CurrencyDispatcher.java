package behavioral.chain.dispatcher;

/**
 * Created by jarydu on 3/14/17.
 */
public interface CurrencyDispatcher {

    void setNext(CurrencyDispatcher dispatcher);

    void dispatch(Currency currency);
}
