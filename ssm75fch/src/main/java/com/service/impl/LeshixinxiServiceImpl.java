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


import com.dao.LeshixinxiDao;
import com.entity.LeshixinxiEntity;
import com.service.LeshixinxiService;
import com.entity.vo.LeshixinxiVO;
import com.entity.view.LeshixinxiView;

@Service("leshixinxiService")
public class LeshixinxiServiceImpl extends ServiceImpl<LeshixinxiDao, LeshixinxiEntity> implements LeshixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LeshixinxiEntity> page = this.selectPage(
                new Query<LeshixinxiEntity>(params).getPage(),
                new EntityWrapper<LeshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LeshixinxiEntity> wrapper) {
		  Page<LeshixinxiView> page =new Query<LeshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LeshixinxiVO> selectListVO(Wrapper<LeshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LeshixinxiVO selectVO(Wrapper<LeshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LeshixinxiView> selectListView(Wrapper<LeshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LeshixinxiView selectView(Wrapper<LeshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
