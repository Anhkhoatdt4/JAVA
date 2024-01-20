package mutable;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Ex01StringMutable {
	public static void main(String[] args) {
		//Mutable : StringBuider ,StringBuffer
		StringBuilder sb = new StringBuilder("Layout");
		hash("sb1", sb);
		
		sb = sb.append("manager");
		hash("sb2",sb);
		System.out.println("value : "+sb);
		//Immutable : String(Literal , object)
		String i = "Box";
		hash("i1", i);
		i=i.concat("layout");
		hash("i2", i);
	
	}
	private static void hash(String text ,Object object)
	{
		System.out.println(text + ":" + System.identityHashCode(object) );
	}
}
