package com.entity.view;

import com.entity.LeshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 乐室信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
@TableName("leshixinxi")
public class LeshixinxiView  extends LeshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LeshixinxiView(){
	}
 
 	public LeshixinxiView(LeshixinxiEntity leshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, leshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
