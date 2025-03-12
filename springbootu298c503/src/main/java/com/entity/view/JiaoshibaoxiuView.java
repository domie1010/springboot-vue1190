package com.entity.view;

import com.entity.JiaoshibaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 教室报修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
@TableName("jiaoshibaoxiu")
public class JiaoshibaoxiuView  extends JiaoshibaoxiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshibaoxiuView(){
	}
 
 	public JiaoshibaoxiuView(JiaoshibaoxiuEntity jiaoshibaoxiuEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshibaoxiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
