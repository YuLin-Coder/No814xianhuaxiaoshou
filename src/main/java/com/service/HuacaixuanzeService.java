package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuacaixuanzeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuacaixuanzeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuacaixuanzeView;


/**
 * 花材选择
 *
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
public interface HuacaixuanzeService extends IService<HuacaixuanzeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuacaixuanzeVO> selectListVO(Wrapper<HuacaixuanzeEntity> wrapper);
   	
   	HuacaixuanzeVO selectVO(@Param("ew") Wrapper<HuacaixuanzeEntity> wrapper);
   	
   	List<HuacaixuanzeView> selectListView(Wrapper<HuacaixuanzeEntity> wrapper);
   	
   	HuacaixuanzeView selectView(@Param("ew") Wrapper<HuacaixuanzeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuacaixuanzeEntity> wrapper);
   	
}

