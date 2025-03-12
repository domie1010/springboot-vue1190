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

import com.entity.JieciEntity;
import com.entity.view.JieciView;

import com.service.JieciService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 节次
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
@RestController
@RequestMapping("/jieci")
public class JieciController {
    @Autowired
    private JieciService jieciService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JieciEntity jieci,
		HttpServletRequest request){
        EntityWrapper<JieciEntity> ew = new EntityWrapper<JieciEntity>();

		PageUtils page = jieciService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jieci), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JieciEntity jieci, 
		HttpServletRequest request){
        EntityWrapper<JieciEntity> ew = new EntityWrapper<JieciEntity>();

		PageUtils page = jieciService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jieci), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JieciEntity jieci){
       	EntityWrapper<JieciEntity> ew = new EntityWrapper<JieciEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jieci, "jieci")); 
        return R.ok().put("data", jieciService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JieciEntity jieci){
        EntityWrapper< JieciEntity> ew = new EntityWrapper< JieciEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jieci, "jieci")); 
		JieciView jieciView =  jieciService.selectView(ew);
		return R.ok("查询节次成功").put("data", jieciView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JieciEntity jieci = jieciService.selectById(id);
        return R.ok().put("data", jieci);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JieciEntity jieci = jieciService.selectById(id);
        return R.ok().put("data", jieci);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JieciEntity jieci, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jieci);
        jieciService.insert(jieci);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JieciEntity jieci, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jieci);
        jieciService.insert(jieci);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JieciEntity jieci, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jieci);
        jieciService.updateById(jieci);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jieciService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
