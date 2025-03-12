package com.entity.vo;

import com.entity.JiaoshimingchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 教室名称
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
public class JiaoshimingchengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 容纳人数
	 */
	
	private String rongnarenshu;
				
	
	/**
	 * 设置：容纳人数
	 */
	 
	public void setRongnarenshu(String rongnarenshu) {
		this.rongnarenshu = rongnarenshu;
	}
	
	/**
	 * 获取：容纳人数
	 */
	public String getRongnarenshu() {
		return rongnarenshu;
	}
			
}
