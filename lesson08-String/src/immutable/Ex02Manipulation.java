package immutable;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String s = "Hello all";
		// Tinh chieu dai cua moi chuoi 
		System.out.println("length = "+ s.length());
		
		//Nối chuỗi s1 vào s
		String s1 ="-heheboai-";
		System.out.println(s1+s);
		System.out.println(s.concat(s1));
		// lấy một ký tự tại vị trí index(3) trong chuỗi
		System.out.println("index(3) : " + s.charAt(1));
		
		//Duyệt từng ký tự trong chuỗi
		for(int i = 0 ; i < s.length() ; i ++)
			
		{
			System.out.println("s" + i + ": " +s.charAt(i));
		}
		
		//Tìm vị trí - chỉ số xuất hiện đầu tiên,
		System.out.println("start index of 'l': " +s.indexOf('l'));
		System.out.println("last index of l : " + s.lastIndexOf('l'));
	

	}
}
