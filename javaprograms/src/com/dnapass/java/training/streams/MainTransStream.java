package com.dnapass.java.training.streams;

import com.dnapass.java.training.collections.ProductType;
import com.dnapass.java.training.collections.Transaction;

public class MainTransStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction t1 = new Transaction(126, ProductType.GROCERIES, 100.33, "USA", "DOLLARS");
		TransactionStream ts = new TransactionStream();
		ts.create(t1);
		System.out.println("Find t1 : " + ts.find(t1));
		Transaction t2 = new Transaction(127, ProductType.ELECTRIC, 159.44, "UK", "GBP");
		System.out.println("Find t2 : " + ts.find(t2));
		System.out.println("Before Update");
		ts.ShowTransactions();
		Transaction t3 = new Transaction(126, ProductType.FUEL, 100.33, "USA", "DOLLARS");
		ts.update(t3);
		System.out.println("After Update");
		ts.ShowTransactions();
		ts.sortByAmount();
		System.out.println("After sort by amount");
		ts.ShowTransactions();
		System.out.println("Find by id and type:");
		ts.findByIdAndProductType(126, ProductType.FUEL);

	}

}