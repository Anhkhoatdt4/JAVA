package view;

import java.util.List;

import persistance.Item;
import persistance.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.PrintUtils;

public class Ex02ItemGroupPage {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
	
		PrintUtils.excuteAndPrint("Cau 6: Them moi loai hang",() ->{
			ItemGroup igtToBeSaved = new ItemGroup( 8 , "JPA/HiberNate Test save 02", "Test Save 02");
			itemGroupService.save(igtToBeSaved);
		});
		
		List<ItemGroup> groups = itemGroupService.getAll();
		PrintUtils.print("\n\nCau 1 : liet ke loai hang", groups);
		
		 List<Item> firstIgItems = groups.get(0).getItems();		
		
		 PrintUtils.print("\n\nMat hang cua loai hang dau tien", firstIgItems);
		// PrintUtils.print("\nCau 1 : liet ke toan bo loai hang",itemGroupService.getAll());
	
		System.out.println("======================");
		
		PrintUtils.print2("\nCau 2 : liet ke loai hang theo ma loai",itemGroupService.get(2));
		
		
		PrintUtils.print("\nCau 5: thong ke so luong mat hang theo tung loai hang",itemGroupService.statistic());
		
		
	}
}
