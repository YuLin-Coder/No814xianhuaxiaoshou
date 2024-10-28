package com.entity.view;

import com.entity.XianhuarukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 鲜花入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
@TableName("xianhuaruku")
public class XianhuarukuView  extends XianhuarukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XianhuarukuView(){
	}
 
 	public XianhuarukuView(XianhuarukuEntity xianhuarukuEntity){
 	try {
			BeanUtils.copyProperties(this, xianhuarukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
