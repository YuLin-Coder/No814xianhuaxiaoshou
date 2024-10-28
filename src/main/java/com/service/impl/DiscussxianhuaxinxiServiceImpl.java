package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussxianhuaxinxiDao;
import com.entity.DiscussxianhuaxinxiEntity;
import com.service.DiscussxianhuaxinxiService;
import com.entity.vo.DiscussxianhuaxinxiVO;
import com.entity.view.DiscussxianhuaxinxiView;

@Service("discussxianhuaxinxiService")
public class DiscussxianhuaxinxiServiceImpl extends ServiceImpl<DiscussxianhuaxinxiDao, DiscussxianhuaxinxiEntity> implements DiscussxianhuaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxianhuaxinxiEntity> page = this.selectPage(
                new Query<DiscussxianhuaxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussxianhuaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxianhuaxinxiEntity> wrapper) {
		  Page<DiscussxianhuaxinxiView> page =new Query<DiscussxianhuaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxianhuaxinxiVO> selectListVO(Wrapper<DiscussxianhuaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxianhuaxinxiVO selectVO(Wrapper<DiscussxianhuaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxianhuaxinxiView> selectListView(Wrapper<DiscussxianhuaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxianhuaxinxiView selectView(Wrapper<DiscussxianhuaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
