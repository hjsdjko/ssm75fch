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

import com.entity.YonghuliuyanEntity;
import com.entity.view.YonghuliuyanView;

import com.service.YonghuliuyanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 用户留言
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-28 09:01:00
 */
@RestController
@RequestMapping("/yonghuliuyan")
public class YonghuliuyanController {
    @Autowired
    private YonghuliuyanService yonghuliuyanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YonghuliuyanEntity yonghuliuyan, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yonghuliuyan.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YonghuliuyanEntity> ew = new EntityWrapper<YonghuliuyanEntity>();
		PageUtils page = yonghuliuyanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghuliuyan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YonghuliuyanEntity yonghuliuyan, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yonghuliuyan.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YonghuliuyanEntity> ew = new EntityWrapper<YonghuliuyanEntity>();
		PageUtils page = yonghuliuyanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghuliuyan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YonghuliuyanEntity yonghuliuyan){
       	EntityWrapper<YonghuliuyanEntity> ew = new EntityWrapper<YonghuliuyanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yonghuliuyan, "yonghuliuyan")); 
        return R.ok().put("data", yonghuliuyanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YonghuliuyanEntity yonghuliuyan){
        EntityWrapper< YonghuliuyanEntity> ew = new EntityWrapper< YonghuliuyanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yonghuliuyan, "yonghuliuyan")); 
		YonghuliuyanView yonghuliuyanView =  yonghuliuyanService.selectView(ew);
		return R.ok("查询用户留言成功").put("data", yonghuliuyanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        YonghuliuyanEntity yonghuliuyan = yonghuliuyanService.selectById(id);
        return R.ok().put("data", yonghuliuyan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        YonghuliuyanEntity yonghuliuyan = yonghuliuyanService.selectById(id);
        return R.ok().put("data", yonghuliuyan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YonghuliuyanEntity yonghuliuyan, HttpServletRequest request){
    	yonghuliuyan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghuliuyan);

        yonghuliuyanService.insert(yonghuliuyan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YonghuliuyanEntity yonghuliuyan, HttpServletRequest request){
    	yonghuliuyan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghuliuyan);
    	yonghuliuyan.setUserid((Long)request.getSession().getAttribute("userId"));

        yonghuliuyanService.insert(yonghuliuyan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YonghuliuyanEntity yonghuliuyan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yonghuliuyan);
        yonghuliuyanService.updateById(yonghuliuyan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yonghuliuyanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YonghuliuyanEntity> wrapper = new EntityWrapper<YonghuliuyanEntity>();
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

		int count = yonghuliuyanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
