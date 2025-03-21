package com.entity.view;

import com.entity.WeihuyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 维护员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
@TableName("weihuyuan")
public class WeihuyuanView  extends WeihuyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeihuyuanView(){
	}
 
 	public WeihuyuanView(WeihuyuanEntity weihuyuanEntity){
 	try {
			BeanUtils.copyProperties(this, weihuyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
