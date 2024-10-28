package com.dao;

import com.entity.HuacaixuanzeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuacaixuanzeVO;
import com.entity.view.HuacaixuanzeView;


/**
 * 花材选择
 * 
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
public interface HuacaixuanzeDao extends BaseMapper<HuacaixuanzeEntity> {
	
	List<HuacaixuanzeVO> selectListVO(@Param("ew") Wrapper<HuacaixuanzeEntity> wrapper);
	
	HuacaixuanzeVO selectVO(@Param("ew") Wrapper<HuacaixuanzeEntity> wrapper);
	
	List<HuacaixuanzeView> selectListView(@Param("ew") Wrapper<HuacaixuanzeEntity> wrapper);

	List<HuacaixuanzeView> selectListView(Pagination page,@Param("ew") Wrapper<HuacaixuanzeEntity> wrapper);
	
	HuacaixuanzeView selectView(@Param("ew") Wrapper<HuacaixuanzeEntity> wrapper);
	
}
