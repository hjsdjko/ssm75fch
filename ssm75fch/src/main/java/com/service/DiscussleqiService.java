package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussleqiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussleqiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussleqiView;


/**
 * 乐器评论表
 *
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface DiscussleqiService extends IService<DiscussleqiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussleqiVO> selectListVO(Wrapper<DiscussleqiEntity> wrapper);
   	
   	DiscussleqiVO selectVO(@Param("ew") Wrapper<DiscussleqiEntity> wrapper);
   	
   	List<DiscussleqiView> selectListView(Wrapper<DiscussleqiEntity> wrapper);
   	
   	DiscussleqiView selectView(@Param("ew") Wrapper<DiscussleqiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussleqiEntity> wrapper);
   	
}

