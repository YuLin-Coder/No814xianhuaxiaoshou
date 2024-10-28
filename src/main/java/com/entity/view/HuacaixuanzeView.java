package com.entity.view;

import com.entity.HuacaixuanzeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 花材选择
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
@TableName("huacaixuanze")
public class HuacaixuanzeView  extends HuacaixuanzeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuacaixuanzeView(){
	}
 
 	public HuacaixuanzeView(HuacaixuanzeEntity huacaixuanzeEntity){
 	try {
			BeanUtils.copyProperties(this, huacaixuanzeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
