import entity.KhoaNgu;

public class DEMO {
	public static void main(String[] args) {
		System.out.println("khoa ngu");
		
		Integer number = new Integer(12);

		KhoaNgu khoa1 = new KhoaNgu(number);
		KhoaNgu khoa2 = new KhoaNgu(21);
		
		String str = new String();
		System.out.print(khoa1);
		System.out.println(khoa2);
		
		khoa1.checkIq();
		khoa2.checkIq();

	}
}
