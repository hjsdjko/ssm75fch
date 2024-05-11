package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LeshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LeshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LeshixinxiView;


/**
 * 乐室信息
 *
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface LeshixinxiService extends IService<LeshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LeshixinxiVO> selectListVO(Wrapper<LeshixinxiEntity> wrapper);
   	
   	LeshixinxiVO selectVO(@Param("ew") Wrapper<LeshixinxiEntity> wrapper);
   	
   	List<LeshixinxiView> selectListView(Wrapper<LeshixinxiEntity> wrapper);
   	
   	LeshixinxiView selectView(@Param("ew") Wrapper<LeshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LeshixinxiEntity> wrapper);
   	
}

