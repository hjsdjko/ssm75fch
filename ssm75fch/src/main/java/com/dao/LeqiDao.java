package com.dao;

import com.entity.LeqiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LeqiVO;
import com.entity.view.LeqiView;


/**
 * 乐器
 * 
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface LeqiDao extends BaseMapper<LeqiEntity> {
	
	List<LeqiVO> selectListVO(@Param("ew") Wrapper<LeqiEntity> wrapper);
	
	LeqiVO selectVO(@Param("ew") Wrapper<LeqiEntity> wrapper);
	
	List<LeqiView> selectListView(@Param("ew") Wrapper<LeqiEntity> wrapper);

	List<LeqiView> selectListView(Pagination page,@Param("ew") Wrapper<LeqiEntity> wrapper);
	
	LeqiView selectView(@Param("ew") Wrapper<LeqiEntity> wrapper);
	
}
