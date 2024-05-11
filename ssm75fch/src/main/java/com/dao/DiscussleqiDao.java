package com.dao;

import com.entity.DiscussleqiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussleqiVO;
import com.entity.view.DiscussleqiView;


/**
 * 乐器评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface DiscussleqiDao extends BaseMapper<DiscussleqiEntity> {
	
	List<DiscussleqiVO> selectListVO(@Param("ew") Wrapper<DiscussleqiEntity> wrapper);
	
	DiscussleqiVO selectVO(@Param("ew") Wrapper<DiscussleqiEntity> wrapper);
	
	List<DiscussleqiView> selectListView(@Param("ew") Wrapper<DiscussleqiEntity> wrapper);

	List<DiscussleqiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussleqiEntity> wrapper);
	
	DiscussleqiView selectView(@Param("ew") Wrapper<DiscussleqiEntity> wrapper);
	
}
