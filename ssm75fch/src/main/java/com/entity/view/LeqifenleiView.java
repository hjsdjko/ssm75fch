package com.entity.view;

import com.entity.LeqifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 乐器分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
@TableName("leqifenlei")
public class LeqifenleiView  extends LeqifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LeqifenleiView(){
	}
 
 	public LeqifenleiView(LeqifenleiEntity leqifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, leqifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
