package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeihuyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeihuyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeihuyuanView;


/**
 * 维护员
 *
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
public interface WeihuyuanService extends IService<WeihuyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeihuyuanVO> selectListVO(Wrapper<WeihuyuanEntity> wrapper);
   	
   	WeihuyuanVO selectVO(@Param("ew") Wrapper<WeihuyuanEntity> wrapper);
   	
   	List<WeihuyuanView> selectListView(Wrapper<WeihuyuanEntity> wrapper);
   	
   	WeihuyuanView selectView(@Param("ew") Wrapper<WeihuyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeihuyuanEntity> wrapper);

   	

}

