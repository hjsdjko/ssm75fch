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


import com.dao.DiscussleshixinxiDao;
import com.entity.DiscussleshixinxiEntity;
import com.service.DiscussleshixinxiService;
import com.entity.vo.DiscussleshixinxiVO;
import com.entity.view.DiscussleshixinxiView;

@Service("discussleshixinxiService")
public class DiscussleshixinxiServiceImpl extends ServiceImpl<DiscussleshixinxiDao, DiscussleshixinxiEntity> implements DiscussleshixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussleshixinxiEntity> page = this.selectPage(
                new Query<DiscussleshixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussleshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussleshixinxiEntity> wrapper) {
		  Page<DiscussleshixinxiView> page =new Query<DiscussleshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussleshixinxiVO> selectListVO(Wrapper<DiscussleshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussleshixinxiVO selectVO(Wrapper<DiscussleshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussleshixinxiView> selectListView(Wrapper<DiscussleshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussleshixinxiView selectView(Wrapper<DiscussleshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
