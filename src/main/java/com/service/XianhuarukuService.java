package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianhuarukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianhuarukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianhuarukuView;


/**
 * 鲜花入库
 *
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
public interface XianhuarukuService extends IService<XianhuarukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianhuarukuVO> selectListVO(Wrapper<XianhuarukuEntity> wrapper);
   	
   	XianhuarukuVO selectVO(@Param("ew") Wrapper<XianhuarukuEntity> wrapper);
   	
   	List<XianhuarukuView> selectListView(Wrapper<XianhuarukuEntity> wrapper);
   	
   	XianhuarukuView selectView(@Param("ew") Wrapper<XianhuarukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianhuarukuEntity> wrapper);
   	
}

