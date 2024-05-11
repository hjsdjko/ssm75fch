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


import com.dao.DiscussleqizhishiDao;
import com.entity.DiscussleqizhishiEntity;
import com.service.DiscussleqizhishiService;
import com.entity.vo.DiscussleqizhishiVO;
import com.entity.view.DiscussleqizhishiView;

@Service("discussleqizhishiService")
public class DiscussleqizhishiServiceImpl extends ServiceImpl<DiscussleqizhishiDao, DiscussleqizhishiEntity> implements DiscussleqizhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussleqizhishiEntity> page = this.selectPage(
                new Query<DiscussleqizhishiEntity>(params).getPage(),
                new EntityWrapper<DiscussleqizhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussleqizhishiEntity> wrapper) {
		  Page<DiscussleqizhishiView> page =new Query<DiscussleqizhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussleqizhishiVO> selectListVO(Wrapper<DiscussleqizhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussleqizhishiVO selectVO(Wrapper<DiscussleqizhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussleqizhishiView> selectListView(Wrapper<DiscussleqizhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussleqizhishiView selectView(Wrapper<DiscussleqizhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
