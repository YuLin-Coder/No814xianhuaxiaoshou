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
 * 鲜花信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
@TableName("xianhuaxinxi")
public class XianhuaxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XianhuaxinxiEntity() {
		
	}
	
	public XianhuaxinxiEntity(T t) {
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
	 * 鲜花名称
	 */
					
	private String xianhuamingcheng;
	
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
	 * 设置：鲜花名称
	 */
	public void setXianhuamingcheng(String xianhuamingcheng) {
		this.xianhuamingcheng = xianhuamingcheng;
	}
	/**
	 * 获取：鲜花名称
	 */
	public String getXianhuamingcheng() {
		return xianhuamingcheng;
	}
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
