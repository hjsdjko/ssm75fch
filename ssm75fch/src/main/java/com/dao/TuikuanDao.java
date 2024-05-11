package com.dao;

import com.entity.TuikuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuikuanVO;
import com.entity.view.TuikuanView;


/**
 * 退款
 * 
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface TuikuanDao extends BaseMapper<TuikuanEntity> {
	
	List<TuikuanVO> selectListVO(@Param("ew") Wrapper<TuikuanEntity> wrapper);
	
	TuikuanVO selectVO(@Param("ew") Wrapper<TuikuanEntity> wrapper);
	
	List<TuikuanView> selectListView(@Param("ew") Wrapper<TuikuanEntity> wrapper);

	List<TuikuanView> selectListView(Pagination page,@Param("ew") Wrapper<TuikuanEntity> wrapper);
	
	TuikuanView selectView(@Param("ew") Wrapper<TuikuanEntity> wrapper);
	
}
