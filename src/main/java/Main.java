import data.Wallet;
import events.NegativeBalanceEvent;
import events.PostiveBalanceEvent;
import predicates.NegativeBalancePredicate;
import predicates.PositiveBalancePredicate;

public class Main {

    public static void main(String[] args) {
        /*
        Spring example:
       @PostConstruct
       public void setup() {
        eventDispatcher.register(new predicates.NegativeBalancePredicate(), new NegativeBalanceEvent());
        eventDispatcher.register(new predicates.PositiveBalancePredicate(), new PostiveBalanceEvent());
                }

         */
        EventDispatcher<Wallet> dispatcher = new EventDispatcher<>();

        dispatcher.register(new NegativeBalancePredicate(), new NegativeBalanceEvent());
        dispatcher.register(new PositiveBalancePredicate(), new PostiveBalanceEvent());

        dispatcher.dispatch(new Wallet(-12d));
    }
}
