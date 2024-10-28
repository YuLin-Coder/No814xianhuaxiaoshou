package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianhuachukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianhuachukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianhuachukuView;


/**
 * 鲜花出库
 *
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
public interface XianhuachukuService extends IService<XianhuachukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianhuachukuVO> selectListVO(Wrapper<XianhuachukuEntity> wrapper);
   	
   	XianhuachukuVO selectVO(@Param("ew") Wrapper<XianhuachukuEntity> wrapper);
   	
   	List<XianhuachukuView> selectListView(Wrapper<XianhuachukuEntity> wrapper);
   	
   	XianhuachukuView selectView(@Param("ew") Wrapper<XianhuachukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianhuachukuEntity> wrapper);
   	
}

