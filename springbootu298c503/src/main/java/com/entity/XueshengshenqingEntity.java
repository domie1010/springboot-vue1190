package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学生申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
@TableName("xueshengshenqing")
public class XueshengshenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshengshenqingEntity() {
		
	}
	
	public XueshengshenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 教室名称
	 */
					
	private String jiaoshimingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教室名称
	 */
	public void setJiaoshimingcheng(String jiaoshimingcheng) {
		this.jiaoshimingcheng = jiaoshimingcheng;
	}
	/**
	 * 获取：教室名称
	 */
	public String getJiaoshimingcheng() {
		return jiaoshimingcheng;
	}
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
