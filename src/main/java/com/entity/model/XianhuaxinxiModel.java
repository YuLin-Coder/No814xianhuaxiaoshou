package com.entity.model;

import com.entity.XianhuaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 鲜花信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
public class XianhuaxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 花材选择
	 */
	
	private String huacaixuanze;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 材料
	 */
	
	private String cailiao;
		
	/**
	 * 花语
	 */
	
	private String huayu;
		
	/**
	 * 鲜花用途
	 */
	
	private String xianhuayongtu;
		
	/**
	 * 赠送对象
	 */
	
	private String zengsongduixiang;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 鲜花详情
	 */
	
	private String xianhuaxiangqing;
		
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
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：花材选择
	 */
	 
	public void setHuacaixuanze(String huacaixuanze) {
		this.huacaixuanze = huacaixuanze;
	}
	
	/**
	 * 获取：花材选择
	 */
	public String getHuacaixuanze() {
		return huacaixuanze;
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
	 * 设置：材料
	 */
	 
	public void setCailiao(String cailiao) {
		this.cailiao = cailiao;
	}
	
	/**
	 * 获取：材料
	 */
	public String getCailiao() {
		return cailiao;
	}
				
	
	/**
	 * 设置：花语
	 */
	 
	public void setHuayu(String huayu) {
		this.huayu = huayu;
	}
	
	/**
	 * 获取：花语
	 */
	public String getHuayu() {
		return huayu;
	}
				
	
	/**
	 * 设置：鲜花用途
	 */
	 
	public void setXianhuayongtu(String xianhuayongtu) {
		this.xianhuayongtu = xianhuayongtu;
	}
	
	/**
	 * 获取：鲜花用途
	 */
	public String getXianhuayongtu() {
		return xianhuayongtu;
	}
				
	
	/**
	 * 设置：赠送对象
	 */
	 
	public void setZengsongduixiang(String zengsongduixiang) {
		this.zengsongduixiang = zengsongduixiang;
	}
	
	/**
	 * 获取：赠送对象
	 */
	public String getZengsongduixiang() {
		return zengsongduixiang;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：鲜花详情
	 */
	 
	public void setXianhuaxiangqing(String xianhuaxiangqing) {
		this.xianhuaxiangqing = xianhuaxiangqing;
	}
	
	/**
	 * 获取：鲜花详情
	 */
	public String getXianhuaxiangqing() {
		return xianhuaxiangqing;
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
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
