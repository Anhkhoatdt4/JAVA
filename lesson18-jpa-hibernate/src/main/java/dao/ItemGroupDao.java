package dao;

import java.util.List;

import persistance.ItemGroup;
import persistance.ItemGroupDto;
	
	public interface ItemGroupDao {
		List<ItemGroup> getAll();
		ItemGroup get(int id);
		
		List<ItemGroupDto> statistic();
		void save(ItemGroup itemGroup);
	}
		
