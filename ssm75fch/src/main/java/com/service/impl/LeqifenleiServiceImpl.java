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


import com.dao.LeqifenleiDao;
import com.entity.LeqifenleiEntity;
import com.service.LeqifenleiService;
import com.entity.vo.LeqifenleiVO;
import com.entity.view.LeqifenleiView;

@Service("leqifenleiService")
public class LeqifenleiServiceImpl extends ServiceImpl<LeqifenleiDao, LeqifenleiEntity> implements LeqifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LeqifenleiEntity> page = this.selectPage(
                new Query<LeqifenleiEntity>(params).getPage(),
                new EntityWrapper<LeqifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LeqifenleiEntity> wrapper) {
		  Page<LeqifenleiView> page =new Query<LeqifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LeqifenleiVO> selectListVO(Wrapper<LeqifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LeqifenleiVO selectVO(Wrapper<LeqifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LeqifenleiView> selectListView(Wrapper<LeqifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LeqifenleiView selectView(Wrapper<LeqifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
