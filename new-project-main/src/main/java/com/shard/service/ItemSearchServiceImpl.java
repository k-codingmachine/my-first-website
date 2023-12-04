package com.shard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shard.domain.ItemVO;
import com.shard.domain.PageVO;
import com.shard.mapper.ItemSearchMapper;

@Service
public class ItemSearchServiceImpl implements ItemSearchService {

	@Autowired
	private ItemSearchMapper mapper;
	
	@Override
	public List<ItemVO> Search(PageVO pagevo) {
		return mapper.getSearchAllWithPaging(pagevo);
	}

	@Override
	public List<ItemVO> RPrice(PageVO vo) {
		return mapper.getRPrice(vo);
	}

	@Override
	public List<ItemVO> HPrice(PageVO vo) {
		return mapper.getHPrice(vo);
	}

	
//	  @Override 
//	  public List<ItemVO> Color(String itemName) {
//		  return null; 
//	}
	 

//	@Override
//	public List<ItemVO> Category(int categoryNum) {
//		return null;
//	}

//	@Override
//	public List<ItemVO> ItemSearch(String itemName) {
//		return null;
//	}

	@Override
	public List<ItemVO> searchWithPaging(PageVO pageVO) {
		return mapper.getItemSearchWithPaging(null, pageVO);
	}

	@Override
	public int getTotalCount() {
		return mapper.getTotalCount();
	}

	@Override
	public List<ItemVO> CategoryWithPaging(int categoryNum, PageVO pageVO) {
        pageVO.setCategoryNum(categoryNum);
        return mapper.getCategory(pageVO);
	}

	@Override
	public List<ItemVO> ColorWithPaging(String itemName, PageVO pageVO) {
		pageVO.setItemName(itemName);
		return mapper.getColor(pageVO);
	}

	@Override
	public List<ItemVO> ItemSearchWithPaging(String itemName, PageVO pageVO) {
		pageVO.setItemName(itemName);
		return mapper.getItemSearch(pageVO);
	}

	@Override
	public int getItemNameCount(String itemName) {
		return mapper.getItemNameCount(itemName);
	}



}
