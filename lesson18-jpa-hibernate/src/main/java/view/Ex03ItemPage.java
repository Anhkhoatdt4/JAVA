package view;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import persistance.ItemGroup;
import service.ItemService;
import service.ItemServiceImpl;
import utils.PrintUtils;

// 



public class Ex03ItemPage {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		
		PrintUtils.excuteAndPrint("Cau 6: Them moi Mat Hang", ()->{
			ItemGroup ig = new ItemGroup();
			ig.setId(9);
			Item itemToBeSaved = new Item(7, "JPA/Hibernate Test Save Item 9", "TEST ", 10d,20d , "Test" , ig);
			itemService.saveOrUpdate(itemToBeSaved);
			
			
		});
		
		
		
		
		
		
		
		List<persistance.Item> items = itemService.getAll();
		PrintUtils.print("Cau 3: Liet ke cac mat hang bao gom loai hang", itemService.getAll());
	
		ItemGroup firstItemIg = items.get(0).getItemGroup();
		PrintUtils.print2("Loai hang cua mat hang dau tien", firstItemIg);
	}
}
