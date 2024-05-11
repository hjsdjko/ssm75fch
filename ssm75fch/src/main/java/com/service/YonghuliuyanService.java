package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuliuyanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuliuyanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuliuyanView;


/**
 * 用户留言
 *
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface YonghuliuyanService extends IService<YonghuliuyanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuliuyanVO> selectListVO(Wrapper<YonghuliuyanEntity> wrapper);
   	
   	YonghuliuyanVO selectVO(@Param("ew") Wrapper<YonghuliuyanEntity> wrapper);
   	
   	List<YonghuliuyanView> selectListView(Wrapper<YonghuliuyanEntity> wrapper);
   	
   	YonghuliuyanView selectView(@Param("ew") Wrapper<YonghuliuyanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuliuyanEntity> wrapper);
   	
}

