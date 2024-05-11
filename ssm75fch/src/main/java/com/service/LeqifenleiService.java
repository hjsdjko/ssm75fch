package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LeqifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LeqifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LeqifenleiView;


/**
 * 乐器分类
 *
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface LeqifenleiService extends IService<LeqifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LeqifenleiVO> selectListVO(Wrapper<LeqifenleiEntity> wrapper);
   	
   	LeqifenleiVO selectVO(@Param("ew") Wrapper<LeqifenleiEntity> wrapper);
   	
   	List<LeqifenleiView> selectListView(Wrapper<LeqifenleiEntity> wrapper);
   	
   	LeqifenleiView selectView(@Param("ew") Wrapper<LeqifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LeqifenleiEntity> wrapper);
   	
}

