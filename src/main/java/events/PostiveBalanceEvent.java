package events;

import data.Wallet;

public class PostiveBalanceEvent implements Event<Wallet> {
    //    add correct implementation here
    @Override
    public void trigger(Wallet data) {
        System.out.println("Positive Balance events.Event: " + data.getBalance());
    }
}
