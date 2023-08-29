package datastructure;

import bean.CustomInteger;

public class Ex12SwapSolution {
	
	public static void main(String[] args) {
		CustomInteger nA = new CustomInteger(22);
		CustomInteger nB = new CustomInteger(66);
		swap(nA, nB);
		System.out.println(nA.toString() + nB);
	}
	public static void swap(CustomInteger f1 , CustomInteger f2) {
		int tmp = f1.value; 
		f1.value= f2.value;
		f2.value = tmp;
	}
}
