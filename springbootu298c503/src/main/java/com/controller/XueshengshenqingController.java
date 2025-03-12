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

import com.entity.XueshengshenqingEntity;
import com.entity.view.XueshengshenqingView;

import com.service.XueshengshenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学生申请
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
@RestController
@RequestMapping("/xueshengshenqing")
public class XueshengshenqingController {
    @Autowired
    private XueshengshenqingService xueshengshenqingService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengshenqingEntity xueshengshenqing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xueshengshenqing.setXueshengxuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengshenqingEntity> ew = new EntityWrapper<XueshengshenqingEntity>();

		PageUtils page = xueshengshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengshenqing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengshenqingEntity xueshengshenqing, 
		HttpServletRequest request){
        EntityWrapper<XueshengshenqingEntity> ew = new EntityWrapper<XueshengshenqingEntity>();

		PageUtils page = xueshengshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengshenqing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengshenqingEntity xueshengshenqing){
       	EntityWrapper<XueshengshenqingEntity> ew = new EntityWrapper<XueshengshenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengshenqing, "xueshengshenqing")); 
        return R.ok().put("data", xueshengshenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengshenqingEntity xueshengshenqing){
        EntityWrapper< XueshengshenqingEntity> ew = new EntityWrapper< XueshengshenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengshenqing, "xueshengshenqing")); 
		XueshengshenqingView xueshengshenqingView =  xueshengshenqingService.selectView(ew);
		return R.ok("查询学生申请成功").put("data", xueshengshenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengshenqingEntity xueshengshenqing = xueshengshenqingService.selectById(id);
        return R.ok().put("data", xueshengshenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengshenqingEntity xueshengshenqing = xueshengshenqingService.selectById(id);
        return R.ok().put("data", xueshengshenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengshenqingEntity xueshengshenqing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xueshengshenqing);
        xueshengshenqingService.insert(xueshengshenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengshenqingEntity xueshengshenqing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xueshengshenqing);
        xueshengshenqingService.insert(xueshengshenqing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshengshenqingEntity xueshengshenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengshenqing);
        xueshengshenqingService.updateById(xueshengshenqing);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<XueshengshenqingEntity> list = new ArrayList<XueshengshenqingEntity>();
        for(Long id : ids) {
            XueshengshenqingEntity xueshengshenqing = xueshengshenqingService.selectById(id);
            xueshengshenqing.setSfsh(sfsh);
            xueshengshenqing.setShhf(shhf);
            list.add(xueshengshenqing);
        }
        xueshengshenqingService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengshenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
