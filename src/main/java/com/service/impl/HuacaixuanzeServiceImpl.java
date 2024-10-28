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


import com.dao.HuacaixuanzeDao;
import com.entity.HuacaixuanzeEntity;
import com.service.HuacaixuanzeService;
import com.entity.vo.HuacaixuanzeVO;
import com.entity.view.HuacaixuanzeView;

@Service("huacaixuanzeService")
public class HuacaixuanzeServiceImpl extends ServiceImpl<HuacaixuanzeDao, HuacaixuanzeEntity> implements HuacaixuanzeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuacaixuanzeEntity> page = this.selectPage(
                new Query<HuacaixuanzeEntity>(params).getPage(),
                new EntityWrapper<HuacaixuanzeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuacaixuanzeEntity> wrapper) {
		  Page<HuacaixuanzeView> page =new Query<HuacaixuanzeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuacaixuanzeVO> selectListVO(Wrapper<HuacaixuanzeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuacaixuanzeVO selectVO(Wrapper<HuacaixuanzeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuacaixuanzeView> selectListView(Wrapper<HuacaixuanzeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuacaixuanzeView selectView(Wrapper<HuacaixuanzeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
