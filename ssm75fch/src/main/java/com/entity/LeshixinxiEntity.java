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
 * 乐室信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
@TableName("leshixinxi")
public class LeshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LeshixinxiEntity() {
		
	}
	
	public LeshixinxiEntity(T t) {
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
	 * 乐室编号
	 */
					
	private String leshibianhao;
	
	/**
	 * 乐室名称
	 */
					
	private String leshimingcheng;
	
	/**
	 * 规模
	 */
					
	private String guimo;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 乐室状态
	 */
					
	private String leshizhuangtai;
	
	/**
	 * 乐器设备
	 */
					
	private String leqishebei;
	
	/**
	 * 可约时间
	 */
					
	private String keyueshijian;
	
	/**
	 * 预约价格
	 */
					
	private Integer yuyuejiage;
	
	/**
	 * 乐室位置
	 */
					
	private String leshiweizhi;
	
	/**
	 * 乐室详情
	 */
					
	private String leshixiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：乐室编号
	 */
	public void setLeshibianhao(String leshibianhao) {
		this.leshibianhao = leshibianhao;
	}
	/**
	 * 获取：乐室编号
	 */
	public String getLeshibianhao() {
		return leshibianhao;
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
	 * 设置：乐室状态
	 */
	public void setLeshizhuangtai(String leshizhuangtai) {
		this.leshizhuangtai = leshizhuangtai;
	}
	/**
	 * 获取：乐室状态
	 */
	public String getLeshizhuangtai() {
		return leshizhuangtai;
	}
	/**
	 * 设置：乐器设备
	 */
	public void setLeqishebei(String leqishebei) {
		this.leqishebei = leqishebei;
	}
	/**
	 * 获取：乐器设备
	 */
	public String getLeqishebei() {
		return leqishebei;
	}
	/**
	 * 设置：可约时间
	 */
	public void setKeyueshijian(String keyueshijian) {
		this.keyueshijian = keyueshijian;
	}
	/**
	 * 获取：可约时间
	 */
	public String getKeyueshijian() {
		return keyueshijian;
	}
	/**
	 * 设置：预约价格
	 */
	public void setYuyuejiage(Integer yuyuejiage) {
		this.yuyuejiage = yuyuejiage;
	}
	/**
	 * 获取：预约价格
	 */
	public Integer getYuyuejiage() {
		return yuyuejiage;
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
	 * 设置：乐室详情
	 */
	public void setLeshixiangqing(String leshixiangqing) {
		this.leshixiangqing = leshixiangqing;
	}
	/**
	 * 获取：乐室详情
	 */
	public String getLeshixiangqing() {
		return leshixiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
