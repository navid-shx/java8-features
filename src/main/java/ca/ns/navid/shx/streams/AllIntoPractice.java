package ca.ns.navid.shx.streams;

import ca.ns.navid.shx.streams.model.Data;
import ca.ns.navid.shx.streams.model.Trader;
import ca.ns.navid.shx.streams.model.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AllIntoPractice {

    static void main() {

        //Find all transactions in 2011 and sort by value (small to high)
        List<Transaction> tr2011 = Data.TRANSACTIONS.stream()
                .filter(transaction -> transaction.year() == 2011)
                .sorted(Comparator.comparing(Transaction::value))
                .toList();


        //What are all the unique cities where the traders work? (2 solutions)
        List<String> cities1 = Data.TRANSACTIONS.stream()
                .map(Transaction::trader)
                .map(Trader::city)
                .distinct()
                .toList();
        Set<String> cities2 = Data.TRANSACTIONS.stream()
                .map(Transaction::trader)
                .map(Trader::city)
                .collect(Collectors.toSet());


        //Find all traders from Cambridge and sort them by name
        List<Trader> traders = Data.TRANSACTIONS.stream()
                .map(Transaction::trader)
                .filter(trader -> trader.city().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::name))
                .toList();


        //Return a string of all traders’ names sorted alphabetically
        String traderStr = Data.TRANSACTIONS.stream()
                .map(Transaction::trader)
                .map(Trader::name)
                .distinct()
                .sorted()
                .reduce("", (name1, name2) -> name1 + name2);


        //Are any traders based in Milan?
        boolean milanBased = Data.TRANSACTIONS.stream()
                .anyMatch(transaction -> transaction.trader().city().equals("Milan"));


        //Print all transactions’ values from the traders living in Cambridge
        Data.TRANSACTIONS.stream()
                .filter(t -> "Cambridge".equals(t.trader().city()))
                .map(Transaction::value)
                .forEach(IO::println);


        //What’s the highest value of all the transactions?
        Optional<Integer> highestValue = Data.TRANSACTIONS.stream()
                        .map(Transaction::value)
                        .reduce(Integer::max);


        //Find the transaction with the smallest value
        Optional<Transaction> smallestTransaction = Data.TRANSACTIONS.stream()
                .min(Comparator.comparing(Transaction::value));
    }
}
