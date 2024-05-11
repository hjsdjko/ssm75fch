package com.dao;

import com.entity.LeqizhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LeqizhishiVO;
import com.entity.view.LeqizhishiView;


/**
 * 乐器知识
 * 
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface LeqizhishiDao extends BaseMapper<LeqizhishiEntity> {
	
	List<LeqizhishiVO> selectListVO(@Param("ew") Wrapper<LeqizhishiEntity> wrapper);
	
	LeqizhishiVO selectVO(@Param("ew") Wrapper<LeqizhishiEntity> wrapper);
	
	List<LeqizhishiView> selectListView(@Param("ew") Wrapper<LeqizhishiEntity> wrapper);

	List<LeqizhishiView> selectListView(Pagination page,@Param("ew") Wrapper<LeqizhishiEntity> wrapper);
	
	LeqizhishiView selectView(@Param("ew") Wrapper<LeqizhishiEntity> wrapper);
	
}
