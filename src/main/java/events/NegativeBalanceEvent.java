package events;

import data.Wallet;

public class NegativeBalanceEvent implements Event<Wallet> {
//    add correct implementation here
    @Override
    public void trigger(Wallet data) {
        System.out.println("Negative Balance events.Event: " + data.getBalance());
    }
}
