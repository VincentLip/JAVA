package org.example;

import org.example.trader.Trader;
import org.example.transaction.Transaction;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main() {

        Trader abdallah = new Trader("Abdallah","Cambridge");
        Trader audrey = new Trader("Audrey","Milan");
        Trader corentin = new Trader("Corentin","Cambridge");
        Trader tristan = new Trader("Tristan","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(abdallah,2011,400),
                new Transaction(abdallah,2012,300),
                new Transaction(audrey,2012,1000),
                new Transaction(audrey,2011,400),
                new Transaction(corentin,2012,710),
                new Transaction(corentin,2012,700),
                new Transaction(tristan,2012,950),
                new Transaction(tristan,2012,900)
        );

        System.out.println("***** 1 *****");

        List<Transaction> transactionList = transactions.stream()
                .filter(t -> t.getYear()==2011).collect(Collectors.toList());
        transactionList.forEach(System.out::println);
        System.out.println();

        System.out.println("***** 2 *****");
        List<String> city = new ArrayList<>();
        city = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(city);
        System.out.println();

        System.out.println("***** 3 *****");

        List<String> traders = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(traders);
        System.out.println();

        System.out.println("***** 4 *****");

        System.out.println(transactions.stream().anyMatch(t -> t.getTrader().getCity() == "Milan"));
        System.out.println();

        System.out.println("***** 5 *****");

        Optional<Integer> optionalInteger = transactions.stream()
                .map(t -> t.getValue())
                .max(Integer::compare);

        System.out.println(optionalInteger.get());
        System.out.println();

        System.out.println("***** 6 *****");

        List<Trader> traderList = transactions.stream()
                .map(t -> t.getTrader())
                .filter(t -> t.getCity() == "Cambridge")
                .distinct()
                .collect(Collectors.toList());

        System.out.println(traderList);
        System.out.println();

        System.out.println("***** 7 *****");

        List<Integer> integerList = transactions.stream()
                .filter(t -> t.getTrader().getCity() == "Cambridge")
                .map(t -> t.getValue())
                .collect(Collectors.toList());

        System.out.println(integerList);
        System.out.println();

        System.out.println("***** 8 *****");

        Optional<Integer> optionalInteger1 = transactions.stream()
                .map(t -> t.getValue())
                .min(Integer::compare);

        System.out.println(optionalInteger1.get());
        System.out.println();


    }
}
