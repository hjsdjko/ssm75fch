package com.entity.vo;

import com.entity.LeqizhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 乐器知识
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public class LeqizhishiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
