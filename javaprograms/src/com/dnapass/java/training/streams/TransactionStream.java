package com.dnapass.java.training.streams;



import com.dnapass.java.training.collections.DataLoader;
import com.dnapass.java.training.collections.ProductType;
import com.dnapass.java.training.collections.Transaction;


import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class TransactionStream {
	public static List<Transaction> TransactionsStream = new ArrayList<Transaction>();
	static {
		TransactionsStream = DataLoader.newTransactions();

	}

	public void create(Transaction tran) {

		TransactionsStream.add(tran);
	}

	public void delete(Transaction tran) {
		TransactionsStream.remove(tran);
	}

	public boolean find(Transaction tran) {

		return TransactionsStream.stream().anyMatch(n -> n.getId() == tran.getId());
	}

	public boolean update(Transaction tran) {
		TransactionsStream.stream().filter(t -> t.getId() == tran.getId()).forEach(t -> {
			t.setId(tran.getId());
			t.setAmount(tran.getAmount());
			t.setCity(tran.getCity());
			t.setCurrency(tran.getCurrency());
			t.setType(tran.getType());
		});
		return true;
	}

	public void ShowTransactions() {
		TransactionsStream.stream().forEach(t -> {
			System.out.println(
					t.getId() + " " + t.getAmount() + " " + t.getCity() + " " + t.getCurrency() + " " + t.getType());
		});
	}

	public boolean removeDuplicate() {
		TransactionsStream.stream().forEach(t -> {
			int temp;
			temp = t.getId();

		});
		return true;
	}

	public boolean swapTransactions(Integer initial, Integer Final) {
		// TransactionsStream.stream().filter(t->t.getId()==intial)

		return true;
	}

	public void findById(Integer id) {

		TransactionsStream.stream().filter(t -> t.getId() == id).forEach(t -> {
			System.out.println(
					t.getId() + " " + t.getAmount() + " " + t.getCity() + " " + t.getCurrency() + " " + t.getType());
		});
	}

//	public boolean newTransaction(Integer initial, Integer Final) {
//		
//		return true;
//	}

	public boolean replaceProductType(ProductType prod, ProductType prod1) {
		TransactionsStream.stream().filter(t -> t.getType() == prod).forEach(t -> {
			t.setType(prod1);
		});
		return true;
	}

	public boolean sortByAmount() {
		// TransactionsStream.stream().filter(t->t.getAmount()).collect(Collectors.)
		TransactionsStream = TransactionsStream.stream().sorted(comparing(t -> t.getAmount())).collect(toList());
		return true;
	}

	public boolean sortByCity() {
		TransactionsStream = TransactionsStream.stream().sorted(comparing(t -> t.getCity())).collect(toList());
		return true;
	}

	public List<Transaction> findByProductType(ProductType prod) {

		TransactionsStream.stream().filter(t -> t.getType() == prod).forEach(t -> {
			System.out.println(
					t.getId() + " " + t.getAmount() + " " + t.getCity() + " " + t.getCurrency() + " " + t.getType());
		});
		return null;
	}

	public List<Transaction> findByIdAndProductType(Integer id, ProductType prod) {
		TransactionsStream.stream().filter(t -> t.getId() == id).filter(t -> t.getType() == prod).forEach(t -> {
			System.out.println(
					t.getId() + " " + t.getAmount() + " " + t.getCity() + " " + t.getCurrency() + " " + t.getType());
		});
		return null;
	}

//	
//	public enum ProductType{
//		FRUITS,GROCERIES,FUEL,ELECTRIC
//	}

}