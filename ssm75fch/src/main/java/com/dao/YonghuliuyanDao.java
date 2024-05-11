package com.dao;

import com.entity.YonghuliuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuliuyanVO;
import com.entity.view.YonghuliuyanView;


/**
 * 用户留言
 * 
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface YonghuliuyanDao extends BaseMapper<YonghuliuyanEntity> {
	
	List<YonghuliuyanVO> selectListVO(@Param("ew") Wrapper<YonghuliuyanEntity> wrapper);
	
	YonghuliuyanVO selectVO(@Param("ew") Wrapper<YonghuliuyanEntity> wrapper);
	
	List<YonghuliuyanView> selectListView(@Param("ew") Wrapper<YonghuliuyanEntity> wrapper);

	List<YonghuliuyanView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuliuyanEntity> wrapper);
	
	YonghuliuyanView selectView(@Param("ew") Wrapper<YonghuliuyanEntity> wrapper);
	
}
