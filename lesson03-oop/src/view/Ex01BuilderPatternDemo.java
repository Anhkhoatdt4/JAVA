package view;

import bean.User;

public class Ex01BuilderPatternDemo {
	public static void main(String[] args) {
		User uA = User.builder()
				.withFirstName("Le")
				.withLastName("Huan")
				.withAge(29)
				.withPhone("123213")
				.withAddress("sdads")
				.build();
		System.out.println(uA);
	}
	
}
