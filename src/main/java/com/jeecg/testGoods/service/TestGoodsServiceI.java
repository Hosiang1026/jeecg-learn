package com.jeecg.testGoods.service;
import com.jeecg.testGoods.entity.TestGoodsEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TestGoodsServiceI extends CommonService{
	
 	public void delete(TestGoodsEntity entity) throws Exception;
 	
 	public Serializable save(TestGoodsEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TestGoodsEntity entity) throws Exception;
 	
}
