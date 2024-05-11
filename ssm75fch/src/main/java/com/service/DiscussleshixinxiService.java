package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussleshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussleshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussleshixinxiView;


/**
 * 乐室信息评论表
 *
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface DiscussleshixinxiService extends IService<DiscussleshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussleshixinxiVO> selectListVO(Wrapper<DiscussleshixinxiEntity> wrapper);
   	
   	DiscussleshixinxiVO selectVO(@Param("ew") Wrapper<DiscussleshixinxiEntity> wrapper);
   	
   	List<DiscussleshixinxiView> selectListView(Wrapper<DiscussleshixinxiEntity> wrapper);
   	
   	DiscussleshixinxiView selectView(@Param("ew") Wrapper<DiscussleshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussleshixinxiEntity> wrapper);
   	
}

