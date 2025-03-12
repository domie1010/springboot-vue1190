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

import com.entity.JiaoshimingchengEntity;
import com.entity.view.JiaoshimingchengView;

import com.service.JiaoshimingchengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 教室名称
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
@RestController
@RequestMapping("/jiaoshimingcheng")
public class JiaoshimingchengController {
    @Autowired
    private JiaoshimingchengService jiaoshimingchengService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoshimingchengEntity jiaoshimingcheng,
		HttpServletRequest request){
        EntityWrapper<JiaoshimingchengEntity> ew = new EntityWrapper<JiaoshimingchengEntity>();

		PageUtils page = jiaoshimingchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshimingcheng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoshimingchengEntity jiaoshimingcheng, 
		HttpServletRequest request){
        EntityWrapper<JiaoshimingchengEntity> ew = new EntityWrapper<JiaoshimingchengEntity>();

		PageUtils page = jiaoshimingchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshimingcheng), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoshimingchengEntity jiaoshimingcheng){
       	EntityWrapper<JiaoshimingchengEntity> ew = new EntityWrapper<JiaoshimingchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoshimingcheng, "jiaoshimingcheng")); 
        return R.ok().put("data", jiaoshimingchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoshimingchengEntity jiaoshimingcheng){
        EntityWrapper< JiaoshimingchengEntity> ew = new EntityWrapper< JiaoshimingchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoshimingcheng, "jiaoshimingcheng")); 
		JiaoshimingchengView jiaoshimingchengView =  jiaoshimingchengService.selectView(ew);
		return R.ok("查询教室名称成功").put("data", jiaoshimingchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoshimingchengEntity jiaoshimingcheng = jiaoshimingchengService.selectById(id);
        return R.ok().put("data", jiaoshimingcheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoshimingchengEntity jiaoshimingcheng = jiaoshimingchengService.selectById(id);
        return R.ok().put("data", jiaoshimingcheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoshimingchengEntity jiaoshimingcheng, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiaoshimingcheng);
        jiaoshimingchengService.insert(jiaoshimingcheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoshimingchengEntity jiaoshimingcheng, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiaoshimingcheng);
        jiaoshimingchengService.insert(jiaoshimingcheng);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaoshimingchengEntity jiaoshimingcheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoshimingcheng);
        jiaoshimingchengService.updateById(jiaoshimingcheng);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoshimingchengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
