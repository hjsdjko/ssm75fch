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

import com.entity.TuikuanEntity;
import com.entity.view.TuikuanView;

import com.service.TuikuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 退款
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
@RestController
@RequestMapping("/tuikuan")
public class TuikuanController {
    @Autowired
    private TuikuanService tuikuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TuikuanEntity tuikuan, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			tuikuan.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TuikuanEntity> ew = new EntityWrapper<TuikuanEntity>();
		PageUtils page = tuikuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuikuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TuikuanEntity tuikuan, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			tuikuan.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TuikuanEntity> ew = new EntityWrapper<TuikuanEntity>();
		PageUtils page = tuikuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuikuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TuikuanEntity tuikuan){
       	EntityWrapper<TuikuanEntity> ew = new EntityWrapper<TuikuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tuikuan, "tuikuan")); 
        return R.ok().put("data", tuikuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TuikuanEntity tuikuan){
        EntityWrapper< TuikuanEntity> ew = new EntityWrapper< TuikuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tuikuan, "tuikuan")); 
		TuikuanView tuikuanView =  tuikuanService.selectView(ew);
		return R.ok("查询退款成功").put("data", tuikuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        TuikuanEntity tuikuan = tuikuanService.selectById(id);
        return R.ok().put("data", tuikuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        TuikuanEntity tuikuan = tuikuanService.selectById(id);
        return R.ok().put("data", tuikuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TuikuanEntity tuikuan, HttpServletRequest request){
    	tuikuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tuikuan);

        tuikuanService.insert(tuikuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TuikuanEntity tuikuan, HttpServletRequest request){
    	tuikuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tuikuan);
    	tuikuan.setUserid((Long)request.getSession().getAttribute("userId"));

        tuikuanService.insert(tuikuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TuikuanEntity tuikuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tuikuan);
        tuikuanService.updateById(tuikuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tuikuanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<TuikuanEntity> wrapper = new EntityWrapper<TuikuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = tuikuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
