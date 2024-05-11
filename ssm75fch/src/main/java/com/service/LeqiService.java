package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LeqiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LeqiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LeqiView;


/**
 * 乐器
 *
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface LeqiService extends IService<LeqiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LeqiVO> selectListVO(Wrapper<LeqiEntity> wrapper);
   	
   	LeqiVO selectVO(@Param("ew") Wrapper<LeqiEntity> wrapper);
   	
   	List<LeqiView> selectListView(Wrapper<LeqiEntity> wrapper);
   	
   	LeqiView selectView(@Param("ew") Wrapper<LeqiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LeqiEntity> wrapper);
   	
}

