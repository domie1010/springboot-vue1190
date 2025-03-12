package com.entity.view;

import com.entity.JiaoshimingchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 教室名称
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
@TableName("jiaoshimingcheng")
public class JiaoshimingchengView  extends JiaoshimingchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshimingchengView(){
	}
 
 	public JiaoshimingchengView(JiaoshimingchengEntity jiaoshimingchengEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshimingchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
