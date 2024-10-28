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


import com.dao.XianhuarukuDao;
import com.entity.XianhuarukuEntity;
import com.service.XianhuarukuService;
import com.entity.vo.XianhuarukuVO;
import com.entity.view.XianhuarukuView;

@Service("xianhuarukuService")
public class XianhuarukuServiceImpl extends ServiceImpl<XianhuarukuDao, XianhuarukuEntity> implements XianhuarukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianhuarukuEntity> page = this.selectPage(
                new Query<XianhuarukuEntity>(params).getPage(),
                new EntityWrapper<XianhuarukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianhuarukuEntity> wrapper) {
		  Page<XianhuarukuView> page =new Query<XianhuarukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianhuarukuVO> selectListVO(Wrapper<XianhuarukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianhuarukuVO selectVO(Wrapper<XianhuarukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianhuarukuView> selectListView(Wrapper<XianhuarukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianhuarukuView selectView(Wrapper<XianhuarukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
