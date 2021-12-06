package com.dnapss.java.training.marksheet;


public class MainMarkSheet {

	public static void main(String[] args) {
SemMarkSheet m1= new SemMarkSheet();
m1.creditInput(1,3,3,4,2,2,1,4,4,3);
m1.gradeInput(1,"C","C","S","A","A","C","B","B","C");

m1.creditInput(2,3,3,2,2,3,1,4,4,3);
m1.gradeInput(2,"B","C","S","S","B","A","D","A","B");

m1.creditInput(3,3,3,2,2,3,3,2,3,4);
m1.gradeInput(3,"A","A","S","S","C","B","S","B","A");

m1.creditInput(4,3,3,3,3,3,2,2,2,4);
m1.gradeInput(4,"B","B","A","B","A","S","S","S","A");

m1.creditInput(5,4,3,3,3,2,2,2,4);
m1.gradeInput(5,"A","B","B","B","S","S","A","A");

m1.creditInput(6,3,3,3,3,4,3,2,2,2);
m1.gradeInput(6,"A","B","A","A","A","A","S","S","S");

m1.creditInput(7,3,3,3,3,3,2,2,2,3);
m1.gradeInput(7,"A","A","A","S","S","S","S","B","A");

m1.creditInput(8,3,3,3,6);
m1.gradeInput(8,"A","A","A","A");

//sms.print();
m1.calCGPA(8);
}

}