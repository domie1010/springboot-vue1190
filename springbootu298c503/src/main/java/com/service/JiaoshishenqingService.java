package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshishenqingView;


/**
 * 教师申请
 *
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
public interface JiaoshishenqingService extends IService<JiaoshishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshishenqingVO> selectListVO(Wrapper<JiaoshishenqingEntity> wrapper);
   	
   	JiaoshishenqingVO selectVO(@Param("ew") Wrapper<JiaoshishenqingEntity> wrapper);
   	
   	List<JiaoshishenqingView> selectListView(Wrapper<JiaoshishenqingEntity> wrapper);
   	
   	JiaoshishenqingView selectView(@Param("ew") Wrapper<JiaoshishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshishenqingEntity> wrapper);

   	

}

