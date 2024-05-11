package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuikuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuikuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuikuanView;


/**
 * 退款
 *
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
public interface TuikuanService extends IService<TuikuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuikuanVO> selectListVO(Wrapper<TuikuanEntity> wrapper);
   	
   	TuikuanVO selectVO(@Param("ew") Wrapper<TuikuanEntity> wrapper);
   	
   	List<TuikuanView> selectListView(Wrapper<TuikuanEntity> wrapper);
   	
   	TuikuanView selectView(@Param("ew") Wrapper<TuikuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuikuanEntity> wrapper);
   	
}

