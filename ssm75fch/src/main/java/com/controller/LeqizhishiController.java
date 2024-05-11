package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.LeqizhishiEntity;
import com.entity.view.LeqizhishiView;

import com.service.LeqizhishiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 乐器知识
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
@RestController
@RequestMapping("/leqizhishi")
public class LeqizhishiController {
    @Autowired
    private LeqizhishiService leqizhishiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LeqizhishiEntity leqizhishi, HttpServletRequest request){

        EntityWrapper<LeqizhishiEntity> ew = new EntityWrapper<LeqizhishiEntity>();
		PageUtils page = leqizhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, leqizhishi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LeqizhishiEntity leqizhishi, HttpServletRequest request){
        EntityWrapper<LeqizhishiEntity> ew = new EntityWrapper<LeqizhishiEntity>();
		PageUtils page = leqizhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, leqizhishi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LeqizhishiEntity leqizhishi){
       	EntityWrapper<LeqizhishiEntity> ew = new EntityWrapper<LeqizhishiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( leqizhishi, "leqizhishi")); 
        return R.ok().put("data", leqizhishiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LeqizhishiEntity leqizhishi){
        EntityWrapper< LeqizhishiEntity> ew = new EntityWrapper< LeqizhishiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( leqizhishi, "leqizhishi")); 
		LeqizhishiView leqizhishiView =  leqizhishiService.selectView(ew);
		return R.ok("查询乐器知识成功").put("data", leqizhishiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        LeqizhishiEntity leqizhishi = leqizhishiService.selectById(id);
        return R.ok().put("data", leqizhishi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        LeqizhishiEntity leqizhishi = leqizhishiService.selectById(id);
        return R.ok().put("data", leqizhishi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LeqizhishiEntity leqizhishi, HttpServletRequest request){
    	leqizhishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(leqizhishi);

        leqizhishiService.insert(leqizhishi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LeqizhishiEntity leqizhishi, HttpServletRequest request){
    	leqizhishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(leqizhishi);

        leqizhishiService.insert(leqizhishi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LeqizhishiEntity leqizhishi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(leqizhishi);
        leqizhishiService.updateById(leqizhishi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        leqizhishiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<LeqizhishiEntity> wrapper = new EntityWrapper<LeqizhishiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = leqizhishiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
