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


import com.dao.TuikuanDao;
import com.entity.TuikuanEntity;
import com.service.TuikuanService;
import com.entity.vo.TuikuanVO;
import com.entity.view.TuikuanView;

@Service("tuikuanService")
public class TuikuanServiceImpl extends ServiceImpl<TuikuanDao, TuikuanEntity> implements TuikuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuikuanEntity> page = this.selectPage(
                new Query<TuikuanEntity>(params).getPage(),
                new EntityWrapper<TuikuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuikuanEntity> wrapper) {
		  Page<TuikuanView> page =new Query<TuikuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuikuanVO> selectListVO(Wrapper<TuikuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuikuanVO selectVO(Wrapper<TuikuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuikuanView> selectListView(Wrapper<TuikuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuikuanView selectView(Wrapper<TuikuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
