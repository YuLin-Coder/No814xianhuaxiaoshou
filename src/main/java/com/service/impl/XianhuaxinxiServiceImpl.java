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


import com.dao.XianhuaxinxiDao;
import com.entity.XianhuaxinxiEntity;
import com.service.XianhuaxinxiService;
import com.entity.vo.XianhuaxinxiVO;
import com.entity.view.XianhuaxinxiView;

@Service("xianhuaxinxiService")
public class XianhuaxinxiServiceImpl extends ServiceImpl<XianhuaxinxiDao, XianhuaxinxiEntity> implements XianhuaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianhuaxinxiEntity> page = this.selectPage(
                new Query<XianhuaxinxiEntity>(params).getPage(),
                new EntityWrapper<XianhuaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianhuaxinxiEntity> wrapper) {
		  Page<XianhuaxinxiView> page =new Query<XianhuaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianhuaxinxiVO> selectListVO(Wrapper<XianhuaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianhuaxinxiVO selectVO(Wrapper<XianhuaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianhuaxinxiView> selectListView(Wrapper<XianhuaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianhuaxinxiView selectView(Wrapper<XianhuaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
