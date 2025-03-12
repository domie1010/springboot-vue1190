package com.dao;

import com.entity.JieciEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JieciVO;
import com.entity.view.JieciView;


/**
 * 节次
 * 
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
public interface JieciDao extends BaseMapper<JieciEntity> {
	
	List<JieciVO> selectListVO(@Param("ew") Wrapper<JieciEntity> wrapper);
	
	JieciVO selectVO(@Param("ew") Wrapper<JieciEntity> wrapper);
	
	List<JieciView> selectListView(@Param("ew") Wrapper<JieciEntity> wrapper);

	List<JieciView> selectListView(Pagination page,@Param("ew") Wrapper<JieciEntity> wrapper);

	
	JieciView selectView(@Param("ew") Wrapper<JieciEntity> wrapper);
	

}
