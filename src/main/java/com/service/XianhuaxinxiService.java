package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianhuaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianhuaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianhuaxinxiView;


/**
 * 鲜花信息
 *
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
public interface XianhuaxinxiService extends IService<XianhuaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianhuaxinxiVO> selectListVO(Wrapper<XianhuaxinxiEntity> wrapper);
   	
   	XianhuaxinxiVO selectVO(@Param("ew") Wrapper<XianhuaxinxiEntity> wrapper);
   	
   	List<XianhuaxinxiView> selectListView(Wrapper<XianhuaxinxiEntity> wrapper);
   	
   	XianhuaxinxiView selectView(@Param("ew") Wrapper<XianhuaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianhuaxinxiEntity> wrapper);
   	
}

