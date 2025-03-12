package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshimingchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshimingchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshimingchengView;


/**
 * 教室名称
 *
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
public interface JiaoshimingchengService extends IService<JiaoshimingchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshimingchengVO> selectListVO(Wrapper<JiaoshimingchengEntity> wrapper);
   	
   	JiaoshimingchengVO selectVO(@Param("ew") Wrapper<JiaoshimingchengEntity> wrapper);
   	
   	List<JiaoshimingchengView> selectListView(Wrapper<JiaoshimingchengEntity> wrapper);
   	
   	JiaoshimingchengView selectView(@Param("ew") Wrapper<JiaoshimingchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshimingchengEntity> wrapper);

   	

}

