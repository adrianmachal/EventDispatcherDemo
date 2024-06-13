package predicates;

import data.Wallet;

import java.util.function.Predicate;

public class NegativeBalancePredicate implements Predicate<Wallet> {
    @Override
    public boolean test(Wallet wallet) {
        return wallet.getBalance() < 0;
    }
}
