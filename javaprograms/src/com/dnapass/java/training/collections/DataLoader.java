package com.dnapass.java.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.dnapass.java.training.streams.Person;

public class DataLoader {

	public static List<Transaction> newTransactions() {
		List<Transaction> Transactions = new ArrayList<Transaction>();
		Transactions.add(new Transaction(123, ProductType.FUEL, 33.33, "LONDON", "GBP"));
		Transactions.add(new Transaction(124, ProductType.ELECTRIC, 100.5, "BANGALORE", "INR"));
		Transactions.add(new Transaction(125, ProductType.GROCERIES, 50.5, "CHENNAI", "INR"));
		return Transactions;
	}

	public static List<Person> newPersons() {
		return Arrays.asList(new Person("ted", "neward", 42), new Person("charlotte", "neward", 39),
				new Person("michal", "neward", 19), new Person("mathew", "newton", 13), new Person("naal", "ford", 45),
				new Person("candy", "ford", 39), new Person("jeff", "brown", 43), new Person("betsy", "brown", 39));
	}
}