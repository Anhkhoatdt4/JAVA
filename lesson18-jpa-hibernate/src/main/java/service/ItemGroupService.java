package service;

import java.util.List;

import persistance.ItemGroup;
import persistance.ItemGroupDto;

public interface ItemGroupService {

	List<ItemGroup> getAll();
	
	ItemGroup get(int id);
	List<ItemGroupDto> statistic();
	
}
