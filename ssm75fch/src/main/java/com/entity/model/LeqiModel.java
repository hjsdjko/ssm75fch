package com.entity.model;

import com.entity.LeqiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 乐器
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public class LeqiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
