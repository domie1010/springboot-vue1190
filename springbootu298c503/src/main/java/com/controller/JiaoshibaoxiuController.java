package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaoshibaoxiuEntity;
import com.entity.view.JiaoshibaoxiuView;

import com.service.JiaoshibaoxiuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 教室报修
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
@RestController
@RequestMapping("/jiaoshibaoxiu")
public class JiaoshibaoxiuController {
    @Autowired
    private JiaoshibaoxiuService jiaoshibaoxiuService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoshibaoxiuEntity jiaoshibaoxiu,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date baoxiuriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date baoxiuriqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			jiaoshibaoxiu.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaoshibaoxiuEntity> ew = new EntityWrapper<JiaoshibaoxiuEntity>();
                if(baoxiuriqistart!=null) ew.ge("baoxiuriqi", baoxiuriqistart);
                if(baoxiuriqiend!=null) ew.le("baoxiuriqi", baoxiuriqiend);

		PageUtils page = jiaoshibaoxiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshibaoxiu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoshibaoxiuEntity jiaoshibaoxiu, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date baoxiuriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date baoxiuriqiend,
		HttpServletRequest request){
        EntityWrapper<JiaoshibaoxiuEntity> ew = new EntityWrapper<JiaoshibaoxiuEntity>();
                if(baoxiuriqistart!=null) ew.ge("baoxiuriqi", baoxiuriqistart);
                if(baoxiuriqiend!=null) ew.le("baoxiuriqi", baoxiuriqiend);

		PageUtils page = jiaoshibaoxiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshibaoxiu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoshibaoxiuEntity jiaoshibaoxiu){
       	EntityWrapper<JiaoshibaoxiuEntity> ew = new EntityWrapper<JiaoshibaoxiuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoshibaoxiu, "jiaoshibaoxiu")); 
        return R.ok().put("data", jiaoshibaoxiuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoshibaoxiuEntity jiaoshibaoxiu){
        EntityWrapper< JiaoshibaoxiuEntity> ew = new EntityWrapper< JiaoshibaoxiuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoshibaoxiu, "jiaoshibaoxiu")); 
		JiaoshibaoxiuView jiaoshibaoxiuView =  jiaoshibaoxiuService.selectView(ew);
		return R.ok("查询教室报修成功").put("data", jiaoshibaoxiuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoshibaoxiuEntity jiaoshibaoxiu = jiaoshibaoxiuService.selectById(id);
        return R.ok().put("data", jiaoshibaoxiu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoshibaoxiuEntity jiaoshibaoxiu = jiaoshibaoxiuService.selectById(id);
        return R.ok().put("data", jiaoshibaoxiu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoshibaoxiuEntity jiaoshibaoxiu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiaoshibaoxiu);
        jiaoshibaoxiuService.insert(jiaoshibaoxiu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoshibaoxiuEntity jiaoshibaoxiu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiaoshibaoxiu);
        jiaoshibaoxiuService.insert(jiaoshibaoxiu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaoshibaoxiuEntity jiaoshibaoxiu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoshibaoxiu);
        jiaoshibaoxiuService.updateById(jiaoshibaoxiu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoshibaoxiuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
