package com.dao;

import com.entity.LeshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LeshixinxiVO;
import com.entity.view.LeshixinxiView;


/**
 * 乐室信息
 * 
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface LeshixinxiDao extends BaseMapper<LeshixinxiEntity> {
	
	List<LeshixinxiVO> selectListVO(@Param("ew") Wrapper<LeshixinxiEntity> wrapper);
	
	LeshixinxiVO selectVO(@Param("ew") Wrapper<LeshixinxiEntity> wrapper);
	
	List<LeshixinxiView> selectListView(@Param("ew") Wrapper<LeshixinxiEntity> wrapper);

	List<LeshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LeshixinxiEntity> wrapper);
	
	LeshixinxiView selectView(@Param("ew") Wrapper<LeshixinxiEntity> wrapper);
	
}
