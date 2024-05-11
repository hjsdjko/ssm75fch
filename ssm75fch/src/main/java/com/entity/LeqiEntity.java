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
 * 乐器
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
@TableName("leqi")
public class LeqiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LeqiEntity() {
		
	}
	
	public LeqiEntity(T t) {
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
	 * 乐器编号
	 */
					
	private String leqibianhao;
	
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
	 * 名师演奏
	 */
					
	private String mingshiyanzou;
	
	/**
	 * 乐室名称
	 */
					
	private String leshimingcheng;
	
	/**
	 * 规模
	 */
					
	private String guimo;
	
	/**
	 * 乐室位置
	 */
					
	private String leshiweizhi;
	
	/**
	 * 乐器详情
	 */
					
	private String leqixiangqing;
	
	
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
	 * 设置：乐器编号
	 */
	public void setLeqibianhao(String leqibianhao) {
		this.leqibianhao = leqibianhao;
	}
	/**
	 * 获取：乐器编号
	 */
	public String getLeqibianhao() {
		return leqibianhao;
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
	 * 设置：名师演奏
	 */
	public void setMingshiyanzou(String mingshiyanzou) {
		this.mingshiyanzou = mingshiyanzou;
	}
	/**
	 * 获取：名师演奏
	 */
	public String getMingshiyanzou() {
		return mingshiyanzou;
	}
	/**
	 * 设置：乐室名称
	 */
	public void setLeshimingcheng(String leshimingcheng) {
		this.leshimingcheng = leshimingcheng;
	}
	/**
	 * 获取：乐室名称
	 */
	public String getLeshimingcheng() {
		return leshimingcheng;
	}
	/**
	 * 设置：规模
	 */
	public void setGuimo(String guimo) {
		this.guimo = guimo;
	}
	/**
	 * 获取：规模
	 */
	public String getGuimo() {
		return guimo;
	}
	/**
	 * 设置：乐室位置
	 */
	public void setLeshiweizhi(String leshiweizhi) {
		this.leshiweizhi = leshiweizhi;
	}
	/**
	 * 获取：乐室位置
	 */
	public String getLeshiweizhi() {
		return leshiweizhi;
	}
	/**
	 * 设置：乐器详情
	 */
	public void setLeqixiangqing(String leqixiangqing) {
		this.leqixiangqing = leqixiangqing;
	}
	/**
	 * 获取：乐器详情
	 */
	public String getLeqixiangqing() {
		return leqixiangqing;
	}

}
