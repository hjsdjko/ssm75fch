package com.dao;

import com.entity.DiscussleqizhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussleqizhishiVO;
import com.entity.view.DiscussleqizhishiView;


/**
 * 乐器知识评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface DiscussleqizhishiDao extends BaseMapper<DiscussleqizhishiEntity> {
	
	List<DiscussleqizhishiVO> selectListVO(@Param("ew") Wrapper<DiscussleqizhishiEntity> wrapper);
	
	DiscussleqizhishiVO selectVO(@Param("ew") Wrapper<DiscussleqizhishiEntity> wrapper);
	
	List<DiscussleqizhishiView> selectListView(@Param("ew") Wrapper<DiscussleqizhishiEntity> wrapper);

	List<DiscussleqizhishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussleqizhishiEntity> wrapper);
	
	DiscussleqizhishiView selectView(@Param("ew") Wrapper<DiscussleqizhishiEntity> wrapper);
	
}
