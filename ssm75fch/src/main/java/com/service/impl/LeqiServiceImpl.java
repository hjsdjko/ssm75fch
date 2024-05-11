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


import com.dao.LeqiDao;
import com.entity.LeqiEntity;
import com.service.LeqiService;
import com.entity.vo.LeqiVO;
import com.entity.view.LeqiView;

@Service("leqiService")
public class LeqiServiceImpl extends ServiceImpl<LeqiDao, LeqiEntity> implements LeqiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LeqiEntity> page = this.selectPage(
                new Query<LeqiEntity>(params).getPage(),
                new EntityWrapper<LeqiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LeqiEntity> wrapper) {
		  Page<LeqiView> page =new Query<LeqiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LeqiVO> selectListVO(Wrapper<LeqiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LeqiVO selectVO(Wrapper<LeqiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LeqiView> selectListView(Wrapper<LeqiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LeqiView selectView(Wrapper<LeqiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
