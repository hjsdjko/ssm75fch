package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LeqizhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LeqizhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LeqizhishiView;


/**
 * 乐器知识
 *
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface LeqizhishiService extends IService<LeqizhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LeqizhishiVO> selectListVO(Wrapper<LeqizhishiEntity> wrapper);
   	
   	LeqizhishiVO selectVO(@Param("ew") Wrapper<LeqizhishiEntity> wrapper);
   	
   	List<LeqizhishiView> selectListView(Wrapper<LeqizhishiEntity> wrapper);
   	
   	LeqizhishiView selectView(@Param("ew") Wrapper<LeqizhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LeqizhishiEntity> wrapper);
   	
}

