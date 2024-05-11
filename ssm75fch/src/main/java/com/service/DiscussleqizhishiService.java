package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussleqizhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussleqizhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussleqizhishiView;


/**
 * 乐器知识评论表
 *
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface DiscussleqizhishiService extends IService<DiscussleqizhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussleqizhishiVO> selectListVO(Wrapper<DiscussleqizhishiEntity> wrapper);
   	
   	DiscussleqizhishiVO selectVO(@Param("ew") Wrapper<DiscussleqizhishiEntity> wrapper);
   	
   	List<DiscussleqizhishiView> selectListView(Wrapper<DiscussleqizhishiEntity> wrapper);
   	
   	DiscussleqizhishiView selectView(@Param("ew") Wrapper<DiscussleqizhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussleqizhishiEntity> wrapper);
   	
}

