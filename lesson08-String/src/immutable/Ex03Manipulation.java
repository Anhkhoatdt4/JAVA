package immutable;

public class Ex03Manipulation {
	public static void main(String[] args) {
		String s ="hello all, hope you enjoy";
		//1. kiem tra chuoi s1 co phai la chuoi bat dau , 
		// ket thuc trong s ko
		String s1 ="hello";
		System.out.println("is s stars with s1 ? " + s.startsWith(s1));
		System.out.println("is s end with s1 ? " + s.endsWith(s1));
		
		// 2. thay the chuoi s1 = s2 trong chuoi s 
		String s2 = "hi";
		String s3 = "all";
		System.out.println(s.replace(s1, s2));
		System.out.println(s.replace(s1, s3));
	
		// 3. Loai bo cac khoang trang thua của chuỗi s3
		// Chỗ nào có nhiều space ,thay thế bằng 1 space 
		s = "  hello    all,   hope   you   enjoy  ";
		s=s.trim().replaceAll("\\s+", " ");
		System.out.println("remove redundant space ||" + s + "||");
		
		
		// 4. Tao chuoi con cua s bat dau tu vi tri so 2
		// subString(startInclusive , endExclusive)
		System.out.println("substring :" + s.substring(2));
		System.out.println("substring :"+ s.substring(2, 7));
		
		// 5. xac dinh chuoi s2 co ton tai trong s hay k 
		System.out.println("Contains: " + s.contains("you"));
	}
}
