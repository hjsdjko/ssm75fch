package com.dao;

import com.entity.DiscussleshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussleshixinxiVO;
import com.entity.view.DiscussleshixinxiView;


/**
 * 乐室信息评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface DiscussleshixinxiDao extends BaseMapper<DiscussleshixinxiEntity> {
	
	List<DiscussleshixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussleshixinxiEntity> wrapper);
	
	DiscussleshixinxiVO selectVO(@Param("ew") Wrapper<DiscussleshixinxiEntity> wrapper);
	
	List<DiscussleshixinxiView> selectListView(@Param("ew") Wrapper<DiscussleshixinxiEntity> wrapper);

	List<DiscussleshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussleshixinxiEntity> wrapper);
	
	DiscussleshixinxiView selectView(@Param("ew") Wrapper<DiscussleshixinxiEntity> wrapper);
	
}
