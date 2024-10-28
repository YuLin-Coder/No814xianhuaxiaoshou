package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxianhuaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxianhuaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxianhuaxinxiView;


/**
 * 鲜花信息评论表
 *
 * @author 
 * @email 
 * @date 2021-01-25 11:41:44
 */
public interface DiscussxianhuaxinxiService extends IService<DiscussxianhuaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxianhuaxinxiVO> selectListVO(Wrapper<DiscussxianhuaxinxiEntity> wrapper);
   	
   	DiscussxianhuaxinxiVO selectVO(@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);
   	
   	List<DiscussxianhuaxinxiView> selectListView(Wrapper<DiscussxianhuaxinxiEntity> wrapper);
   	
   	DiscussxianhuaxinxiView selectView(@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxianhuaxinxiEntity> wrapper);
   	
}

