package com.shard.mapper;

import java.util.List;


import com.shard.domain.ItemVO;
import com.shard.domain.PageVO;

public interface ItemSearchMapper {

	public List<ItemVO> getSearchAll(PageVO vo);
	public List<ItemVO> getRPrice(PageVO vo);
	public List<ItemVO> getHPrice(PageVO vo);
	public List<ItemVO> getColor(PageVO pageVO);
	public List<ItemVO> ColorWithPaging(String itemName, PageVO pageVO);
	public List<ItemVO> getCategory(PageVO pageVO);
	public List<ItemVO> CategoryWithPaging(int categoryNum, PageVO pageVO);
	public List<ItemVO> getItemSearch(PageVO pageVO);
	public List<ItemVO> getItemSearchWithPaging(String itemName, PageVO pageVO);
	public List<ItemVO> getSearchAllWithPaging(PageVO pagevo);
	public int getItemNameCount(String itemName);
	public int getTotalCount();	

}
