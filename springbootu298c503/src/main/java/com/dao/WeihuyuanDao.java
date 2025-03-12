package com.dao;

import com.entity.WeihuyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeihuyuanVO;
import com.entity.view.WeihuyuanView;


/**
 * 维护员
 * 
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
public interface WeihuyuanDao extends BaseMapper<WeihuyuanEntity> {
	
	List<WeihuyuanVO> selectListVO(@Param("ew") Wrapper<WeihuyuanEntity> wrapper);
	
	WeihuyuanVO selectVO(@Param("ew") Wrapper<WeihuyuanEntity> wrapper);
	
	List<WeihuyuanView> selectListView(@Param("ew") Wrapper<WeihuyuanEntity> wrapper);

	List<WeihuyuanView> selectListView(Pagination page,@Param("ew") Wrapper<WeihuyuanEntity> wrapper);

	
	WeihuyuanView selectView(@Param("ew") Wrapper<WeihuyuanEntity> wrapper);
	

}
