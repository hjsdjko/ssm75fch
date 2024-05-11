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


import com.dao.YonghuliuyanDao;
import com.entity.YonghuliuyanEntity;
import com.service.YonghuliuyanService;
import com.entity.vo.YonghuliuyanVO;
import com.entity.view.YonghuliuyanView;

@Service("yonghuliuyanService")
public class YonghuliuyanServiceImpl extends ServiceImpl<YonghuliuyanDao, YonghuliuyanEntity> implements YonghuliuyanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuliuyanEntity> page = this.selectPage(
                new Query<YonghuliuyanEntity>(params).getPage(),
                new EntityWrapper<YonghuliuyanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuliuyanEntity> wrapper) {
		  Page<YonghuliuyanView> page =new Query<YonghuliuyanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuliuyanVO> selectListVO(Wrapper<YonghuliuyanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuliuyanVO selectVO(Wrapper<YonghuliuyanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuliuyanView> selectListView(Wrapper<YonghuliuyanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuliuyanView selectView(Wrapper<YonghuliuyanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
