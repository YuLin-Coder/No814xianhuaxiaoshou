package com.dao;

import com.entity.XianhuarukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianhuarukuVO;
import com.entity.view.XianhuarukuView;


/**
 * 鲜花入库
 * 
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
public interface XianhuarukuDao extends BaseMapper<XianhuarukuEntity> {
	
	List<XianhuarukuVO> selectListVO(@Param("ew") Wrapper<XianhuarukuEntity> wrapper);
	
	XianhuarukuVO selectVO(@Param("ew") Wrapper<XianhuarukuEntity> wrapper);
	
	List<XianhuarukuView> selectListView(@Param("ew") Wrapper<XianhuarukuEntity> wrapper);

	List<XianhuarukuView> selectListView(Pagination page,@Param("ew") Wrapper<XianhuarukuEntity> wrapper);
	
	XianhuarukuView selectView(@Param("ew") Wrapper<XianhuarukuEntity> wrapper);
	
}
