package com.entity.model;

import com.entity.XueshengshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
public class XueshengshenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 申请周次
	 */
	
	private String shenqingzhouci;
		
	/**
	 * 申请星期
	 */
	
	private String shenqingxingqi;
		
	/**
	 * 申请节次
	 */
	
	private String shenqingjieci;
		
	/**
	 * 用户名
	 */
	
	private String xueshengxuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * 申请原因
	 */
	
	private String shenqingyuanyin;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：申请周次
	 */
	 
	public void setShenqingzhouci(String shenqingzhouci) {
		this.shenqingzhouci = shenqingzhouci;
	}
	
	/**
	 * 获取：申请周次
	 */
	public String getShenqingzhouci() {
		return shenqingzhouci;
	}
				
	
	/**
	 * 设置：申请星期
	 */
	 
	public void setShenqingxingqi(String shenqingxingqi) {
		this.shenqingxingqi = shenqingxingqi;
	}
	
	/**
	 * 获取：申请星期
	 */
	public String getShenqingxingqi() {
		return shenqingxingqi;
	}
				
	
	/**
	 * 设置：申请节次
	 */
	 
	public void setShenqingjieci(String shenqingjieci) {
		this.shenqingjieci = shenqingjieci;
	}
	
	/**
	 * 获取：申请节次
	 */
	public String getShenqingjieci() {
		return shenqingjieci;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setXueshengxuehao(String xueshengxuehao) {
		this.xueshengxuehao = xueshengxuehao;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getXueshengxuehao() {
		return xueshengxuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
				
	
	/**
	 * 设置：申请原因
	 */
	 
	public void setShenqingyuanyin(String shenqingyuanyin) {
		this.shenqingyuanyin = shenqingyuanyin;
	}
	
	/**
	 * 获取：申请原因
	 */
	public String getShenqingyuanyin() {
		return shenqingyuanyin;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
