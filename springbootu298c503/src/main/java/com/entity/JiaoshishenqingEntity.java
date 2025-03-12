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
 * 教师申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
@TableName("jiaoshishenqing")
public class JiaoshishenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshishenqingEntity() {
		
	}
	
	public JiaoshishenqingEntity(T t) {
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
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 学生班级
	 */
					
	private String xueshengbanji;
	
	/**
	 * 学生人数
	 */
					
	private String xueshengrenshu;
	
	/**
	 * 教室号
	 */
					
	private String jiaoshihao;
	
	/**
	 * 周次
	 */
					
	private String zhouci;
	
	/**
	 * 星期
	 */
					
	private String xingqi;
	
	/**
	 * 节次
	 */
					
	private String jieci;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
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
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
	/**
	 * 设置：学生班级
	 */
	public void setXueshengbanji(String xueshengbanji) {
		this.xueshengbanji = xueshengbanji;
	}
	/**
	 * 获取：学生班级
	 */
	public String getXueshengbanji() {
		return xueshengbanji;
	}
	/**
	 * 设置：学生人数
	 */
	public void setXueshengrenshu(String xueshengrenshu) {
		this.xueshengrenshu = xueshengrenshu;
	}
	/**
	 * 获取：学生人数
	 */
	public String getXueshengrenshu() {
		return xueshengrenshu;
	}
	/**
	 * 设置：教室号
	 */
	public void setJiaoshihao(String jiaoshihao) {
		this.jiaoshihao = jiaoshihao;
	}
	/**
	 * 获取：教室号
	 */
	public String getJiaoshihao() {
		return jiaoshihao;
	}
	/**
	 * 设置：周次
	 */
	public void setZhouci(String zhouci) {
		this.zhouci = zhouci;
	}
	/**
	 * 获取：周次
	 */
	public String getZhouci() {
		return zhouci;
	}
	/**
	 * 设置：星期
	 */
	public void setXingqi(String xingqi) {
		this.xingqi = xingqi;
	}
	/**
	 * 获取：星期
	 */
	public String getXingqi() {
		return xingqi;
	}
	/**
	 * 设置：节次
	 */
	public void setJieci(String jieci) {
		this.jieci = jieci;
	}
	/**
	 * 获取：节次
	 */
	public String getJieci() {
		return jieci;
	}
	/**
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
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
