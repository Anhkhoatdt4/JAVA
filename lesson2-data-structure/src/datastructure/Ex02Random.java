package datastructure;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
//	1. Random 1 so nguyen ngau nhien
		Random rd = new Random();
		int arbitraryNumber = rd.nextInt();
		System.out.println("arbitraryNumber: "+ arbitraryNumber);
//	2. Random 1 so nguyen ngau nhien nho hon N [0 - N]
		int secondRand = rd.nextInt(10);
		System.out.println("secondRand: "+ secondRand);
//	3. random 1 so ngau nhien trong khoang gia tri
//		random(a,b) = a + random( b-a+1 )
		int rangeRand = 100 + rd.nextInt(6);
		System.out.println(rangeRand);
	}
}
