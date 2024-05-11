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


import com.dao.LeqizhishiDao;
import com.entity.LeqizhishiEntity;
import com.service.LeqizhishiService;
import com.entity.vo.LeqizhishiVO;
import com.entity.view.LeqizhishiView;

@Service("leqizhishiService")
public class LeqizhishiServiceImpl extends ServiceImpl<LeqizhishiDao, LeqizhishiEntity> implements LeqizhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LeqizhishiEntity> page = this.selectPage(
                new Query<LeqizhishiEntity>(params).getPage(),
                new EntityWrapper<LeqizhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LeqizhishiEntity> wrapper) {
		  Page<LeqizhishiView> page =new Query<LeqizhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LeqizhishiVO> selectListVO(Wrapper<LeqizhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LeqizhishiVO selectVO(Wrapper<LeqizhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LeqizhishiView> selectListView(Wrapper<LeqizhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LeqizhishiView selectView(Wrapper<LeqizhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
