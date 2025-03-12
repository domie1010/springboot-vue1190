package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JieciEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JieciVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JieciView;


/**
 * 节次
 *
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
public interface JieciService extends IService<JieciEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JieciVO> selectListVO(Wrapper<JieciEntity> wrapper);
   	
   	JieciVO selectVO(@Param("ew") Wrapper<JieciEntity> wrapper);
   	
   	List<JieciView> selectListView(Wrapper<JieciEntity> wrapper);
   	
   	JieciView selectView(@Param("ew") Wrapper<JieciEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JieciEntity> wrapper);

   	

}

