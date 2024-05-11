package com.dao;

import com.entity.LeqifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LeqifenleiVO;
import com.entity.view.LeqifenleiView;


/**
 * 乐器分类
 * 
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface LeqifenleiDao extends BaseMapper<LeqifenleiEntity> {
	
	List<LeqifenleiVO> selectListVO(@Param("ew") Wrapper<LeqifenleiEntity> wrapper);
	
	LeqifenleiVO selectVO(@Param("ew") Wrapper<LeqifenleiEntity> wrapper);
	
	List<LeqifenleiView> selectListView(@Param("ew") Wrapper<LeqifenleiEntity> wrapper);

	List<LeqifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<LeqifenleiEntity> wrapper);
	
	LeqifenleiView selectView(@Param("ew") Wrapper<LeqifenleiEntity> wrapper);
	
}
