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


import com.dao.XianhuachukuDao;
import com.entity.XianhuachukuEntity;
import com.service.XianhuachukuService;
import com.entity.vo.XianhuachukuVO;
import com.entity.view.XianhuachukuView;

@Service("xianhuachukuService")
public class XianhuachukuServiceImpl extends ServiceImpl<XianhuachukuDao, XianhuachukuEntity> implements XianhuachukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianhuachukuEntity> page = this.selectPage(
                new Query<XianhuachukuEntity>(params).getPage(),
                new EntityWrapper<XianhuachukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianhuachukuEntity> wrapper) {
		  Page<XianhuachukuView> page =new Query<XianhuachukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianhuachukuVO> selectListVO(Wrapper<XianhuachukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianhuachukuVO selectVO(Wrapper<XianhuachukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianhuachukuView> selectListView(Wrapper<XianhuachukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianhuachukuView selectView(Wrapper<XianhuachukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
