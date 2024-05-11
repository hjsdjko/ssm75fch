package com.entity.vo;

import com.entity.YonghuyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 用户预约
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public class YonghuyuyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 预约名称
	 */
	
	private String yuyuemingcheng;
		
	/**
	 * 乐室名称
	 */
	
	private String leshimingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 乐室状态
	 */
	
	private String leshizhuangtai;
		
	/**
	 * 使用时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shiyongshijian;
		
	/**
	 * 预约价格
	 */
	
	private String yuyuejiage;
		
	/**
	 * 使用时长
	 */
	
	private Integer shiyongshizhang;
		
	/**
	 * 总价格
	 */
	
	private Integer zongjiage;
		
	/**
	 * 预约内容
	 */
	
	private String yuyueneirong;
		
	/**
	 * 使用人数
	 */
	
	private Integer shiyongrenshu;
		
	/**
	 * 申请日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：预约名称
	 */
	 
	public void setYuyuemingcheng(String yuyuemingcheng) {
		this.yuyuemingcheng = yuyuemingcheng;
	}
	
	/**
	 * 获取：预约名称
	 */
	public String getYuyuemingcheng() {
		return yuyuemingcheng;
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
	 * 设置：使用时间
	 */
	 
	public void setShiyongshijian(Date shiyongshijian) {
		this.shiyongshijian = shiyongshijian;
	}
	
	/**
	 * 获取：使用时间
	 */
	public Date getShiyongshijian() {
		return shiyongshijian;
	}
				
	
	/**
	 * 设置：预约价格
	 */
	 
	public void setYuyuejiage(String yuyuejiage) {
		this.yuyuejiage = yuyuejiage;
	}
	
	/**
	 * 获取：预约价格
	 */
	public String getYuyuejiage() {
		return yuyuejiage;
	}
				
	
	/**
	 * 设置：使用时长
	 */
	 
	public void setShiyongshizhang(Integer shiyongshizhang) {
		this.shiyongshizhang = shiyongshizhang;
	}
	
	/**
	 * 获取：使用时长
	 */
	public Integer getShiyongshizhang() {
		return shiyongshizhang;
	}
				
	
	/**
	 * 设置：总价格
	 */
	 
	public void setZongjiage(Integer zongjiage) {
		this.zongjiage = zongjiage;
	}
	
	/**
	 * 获取：总价格
	 */
	public Integer getZongjiage() {
		return zongjiage;
	}
				
	
	/**
	 * 设置：预约内容
	 */
	 
	public void setYuyueneirong(String yuyueneirong) {
		this.yuyueneirong = yuyueneirong;
	}
	
	/**
	 * 获取：预约内容
	 */
	public String getYuyueneirong() {
		return yuyueneirong;
	}
				
	
	/**
	 * 设置：使用人数
	 */
	 
	public void setShiyongrenshu(Integer shiyongrenshu) {
		this.shiyongrenshu = shiyongrenshu;
	}
	
	/**
	 * 获取：使用人数
	 */
	public Integer getShiyongrenshu() {
		return shiyongrenshu;
	}
				
	
	/**
	 * 设置：申请日期
	 */
	 
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
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
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
