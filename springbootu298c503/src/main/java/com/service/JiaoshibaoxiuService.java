package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshibaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshibaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshibaoxiuView;


/**
 * 教室报修
 *
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
public interface JiaoshibaoxiuService extends IService<JiaoshibaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshibaoxiuVO> selectListVO(Wrapper<JiaoshibaoxiuEntity> wrapper);
   	
   	JiaoshibaoxiuVO selectVO(@Param("ew") Wrapper<JiaoshibaoxiuEntity> wrapper);
   	
   	List<JiaoshibaoxiuView> selectListView(Wrapper<JiaoshibaoxiuEntity> wrapper);
   	
   	JiaoshibaoxiuView selectView(@Param("ew") Wrapper<JiaoshibaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshibaoxiuEntity> wrapper);

   	

}

