package view;

import java.util.Random;
import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		Random rd = new Random();
		String[] colors = {"Yellow","Red","Blue","Green","Black"};
		Car[] cars = new Car[100];
		for ( int i = 0 ; i< 100 ; i++) {
			Car car = new Car (i, "Audi",colors[rd.nextInt(colors.length)]);
			cars[i] = car;
		}
		
		// doi model audi thanh MG ;
		for ( Car h : cars) {
			h.model = "MG";
			System.out.println(h);
		}
	}
}
