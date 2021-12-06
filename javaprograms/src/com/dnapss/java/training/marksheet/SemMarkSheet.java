package com.dnapss.java.training.marksheet;

import java.util.ArrayList;
import java.util.TreeMap;

public class SemMarkSheet {

	//static int cCount = 1, gCount = 1;
	int sum = 0;
	TreeMap<Integer, ArrayList> creditMap = new TreeMap<Integer, ArrayList>();
	TreeMap<Integer, ArrayList> gradeMap = new TreeMap<Integer, ArrayList>();
	ArrayList<Integer> credits = new ArrayList<Integer>();
	ArrayList<String> grades = new ArrayList<String>();

	public void creditInput(int sem,int... credit) {
		ArrayList<Integer> credits = new ArrayList<Integer>();
		for (int c : credit) {
			credits.add(c);
		}
		creditMap.put(sem, credits);
		//cCount++;
	}

	public void gradeInput(int sem,String... grade) {
		ArrayList<String> grades = new ArrayList<String>();
		for (String g : grade) {
			grades.add(g);
		}
		gradeMap.put(sem, grades);
		//gCount++;
	}

	public void calCGPA(int sem) {
		ArrayList cval;
		ArrayList gval;
		int grade = 0, sum = 0, credit = 0;
		float cgpa = 0;
		try {
			for (int i = 1; i <= sem; i++) {
				sum = 0;
				credit = 0;
				cval = creditMap.get(i);
				gval = gradeMap.get(i);
				System.out.println("Semester : "+i);
				for (int j = 0; j < gval.size(); j++) {		
					System.out.println("Subject : "+(j+1)+"\tCredit : " + cval.get(j) + "\tGrade : " + gval.get(j));
					if (gval.get(j) == "S")
						grade = 10;
					else if (gval.get(j) == "A")
						grade = 9;
					else if (gval.get(j) == "B")
						grade = 8;
					else if (gval.get(j) == "C")
						grade = 7;
					else if (gval.get(j) == "D")
						grade = 6;
					else if (gval.get(j) == "E")
						grade = 5;
					else if (gval.get(j) == "U")
						grade = 0;
					sum += (int) cval.get(j) * grade;
					credit += (int) cval.get(j);
				}
				//System.out.println("Sum :" + sum + " " + "Credit :" + credit + " " + "GPA :" + (float) sum / credit);
				cgpa += ((float) sum / credit);
				System.out.format("GPA : %.2f\n\n",((float) sum / credit));
			}
			System.out.format("\nCGPA : %.2f\n", cgpa/sem);
		} 
		catch (Exception e) {
			System.out.println("exception " + e);
		}
	}

	public void print() {
		System.out.println("Credit : ");
		creditMap.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});

		System.out.println("Grade : ");
		gradeMap.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
	}
}