package immutable;

public class Ex06Split {
	public static void main(String[] args) {
		String s = " Xin chao cac ban ";
//		s= s.trim().replaceAll("//s+", s);
//		System.tlnout.prin(s);
		String text = "Welcome to class";
		
		//Print words from text , each word on each line
		String[] tokens = text.split("\\s");
		System.out.println("length : "+ tokens.length);
		for (String token : tokens)
			System.out.println(token);
		System.out.println("==============");
		
		String line = "Susan, 0932549135, 20, English";
		tokens = line.split(",\\s");
		for (String token : tokens)
			System.out.println(token);
		

	    line = "   Like,,   09325231321,  25,  Vietnamese";
		tokens = line.trim().split("[,\\s]+"); // su khac biet co them dau cong la 1 hay nhieu dau space , van cat
		
		for (String token : tokens)
			System.out.println(token);
		
		String numberAsString = "9321a2dsd3213cdf";
		tokens = numberAsString.split("[a-zA-Z]+");
		
		for (String token : tokens)
			System.out.println(token);
	}
}
