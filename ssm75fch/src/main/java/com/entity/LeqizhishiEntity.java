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
 * 乐器知识
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
@TableName("leqizhishi")
public class LeqizhishiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LeqizhishiEntity() {
		
	}
	
	public LeqizhishiEntity(T t) {
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
	@TableId
	private Long id;
	/**
	 * 乐器名称
	 */
					
	private String leqimingcheng;
	
	/**
	 * 分类
	 */
					
	private String fenlei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 资料附件
	 */
					
	private String ziliaofujian;
	
	/**
	 * 乐器知识
	 */
					
	private String leqizhishi;
	
	
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
	 * 设置：乐器名称
	 */
	public void setLeqimingcheng(String leqimingcheng) {
		this.leqimingcheng = leqimingcheng;
	}
	/**
	 * 获取：乐器名称
	 */
	public String getLeqimingcheng() {
		return leqimingcheng;
	}
	/**
	 * 设置：分类
	 */
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：资料附件
	 */
	public void setZiliaofujian(String ziliaofujian) {
		this.ziliaofujian = ziliaofujian;
	}
	/**
	 * 获取：资料附件
	 */
	public String getZiliaofujian() {
		return ziliaofujian;
	}
	/**
	 * 设置：乐器知识
	 */
	public void setLeqizhishi(String leqizhishi) {
		this.leqizhishi = leqizhishi;
	}
	/**
	 * 获取：乐器知识
	 */
	public String getLeqizhishi() {
		return leqizhishi;
	}

}
