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


import com.dao.DiscussleqiDao;
import com.entity.DiscussleqiEntity;
import com.service.DiscussleqiService;
import com.entity.vo.DiscussleqiVO;
import com.entity.view.DiscussleqiView;

@Service("discussleqiService")
public class DiscussleqiServiceImpl extends ServiceImpl<DiscussleqiDao, DiscussleqiEntity> implements DiscussleqiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussleqiEntity> page = this.selectPage(
                new Query<DiscussleqiEntity>(params).getPage(),
                new EntityWrapper<DiscussleqiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussleqiEntity> wrapper) {
		  Page<DiscussleqiView> page =new Query<DiscussleqiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussleqiVO> selectListVO(Wrapper<DiscussleqiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussleqiVO selectVO(Wrapper<DiscussleqiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussleqiView> selectListView(Wrapper<DiscussleqiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussleqiView selectView(Wrapper<DiscussleqiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
