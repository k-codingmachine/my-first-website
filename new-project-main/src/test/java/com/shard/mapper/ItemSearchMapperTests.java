package com.shard.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shard.domain.ItemVO;
import com.shard.domain.PageVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ItemSearchMapperTests {

	@Autowired
	private ItemSearchMapper mapper;
	
	@Test
	public void testGetSearchAll(){
//		mapper.getSearchAll().forEach(list -> log.info(list));
	}

	@Test
	public void testGetHPrice(){
		PageVO pagevo = new PageVO(1,mapper.getTotalCount());
		mapper.getHPrice(pagevo).forEach(list -> log.info(list));
	}
	@Test
	public void testGetRPrice(){
		PageVO pagevo = new PageVO(1,mapper.getTotalCount());
		mapper.getRPrice(pagevo).forEach(list -> log.info(list));	
	}
	/*
	 * @Test public void testGetColor(){
	 * mapper.getColor("베이지").forEach(list->log.info(list)); }
	 */
	
  	@Test
    public void testGetColorWithPaging() {
        String itemName = "베이지"; 
        PageVO pageVO = new PageVO(1, mapper.getTotalCount());
        pageVO.setItemName(itemName);
        mapper.getColor(pageVO).forEach(list -> log.info(list));
    }
	
	 
		/*
		 * @Test public void testGetCategory(){ mapper.getCategory(1).forEach(list ->
		 * log.info(list)); }
		 */
	  
  	@Test
    public void testGetCategoryWithPaging() {
        int categoryNum = 1; 
        PageVO pageVO = new PageVO(1, mapper.getTotalCount());
        pageVO.setCategoryNum(categoryNum);
		/*
		 * List<ItemVO> itemList = mapper.getCategory(pageVO); itemList.forEach(item ->
		 * log.info(item));
		 */
        mapper.getCategory(pageVO).forEach(list -> log.info(list));
    }
	
	/*
	 * @Test public void testGetItemSearch(){
	 * mapper.getItemSearch("오버핏").forEach(list -> log.info(list)); }
	 */
  	
  	@Test
    public void testGetItemSearchWithPaging() {
        String itemName = "오버핏"; 
        PageVO pageVO = new PageVO(1, mapper.getTotalCount());
        pageVO.setItemName(itemName);
        mapper.getItemSearch(pageVO).forEach(list -> log.info(list));
    }
  	
  
	  @Test 
	  public void testGetSearchAllWithPaging(){
		  PageVO pageVO = new PageVO(1,mapper.getTotalCount());
		  mapper.getSearchAllWithPaging(pageVO).forEach(list -> log.info(list)); 
	  }
	 
	  @Test 
	  public void testGetTotalCount(){
		  mapper.getTotalCount(); 
	  }
	  
	  @Test 
	  public void testGetColorCount(){
		  String itemName = "블랙";  
		  mapper.getItemNameCount(itemName); 
	  }
	 
	
  
}
