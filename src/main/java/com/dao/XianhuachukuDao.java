package com.dao;

import com.entity.XianhuachukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianhuachukuVO;
import com.entity.view.XianhuachukuView;


/**
 * 鲜花出库
 * 
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
public interface XianhuachukuDao extends BaseMapper<XianhuachukuEntity> {
	
	List<XianhuachukuVO> selectListVO(@Param("ew") Wrapper<XianhuachukuEntity> wrapper);
	
	XianhuachukuVO selectVO(@Param("ew") Wrapper<XianhuachukuEntity> wrapper);
	
	List<XianhuachukuView> selectListView(@Param("ew") Wrapper<XianhuachukuEntity> wrapper);

	List<XianhuachukuView> selectListView(Pagination page,@Param("ew") Wrapper<XianhuachukuEntity> wrapper);
	
	XianhuachukuView selectView(@Param("ew") Wrapper<XianhuachukuEntity> wrapper);
	
}
