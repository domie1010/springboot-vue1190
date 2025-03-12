package com.dao;

import com.entity.JiaoshibaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshibaoxiuVO;
import com.entity.view.JiaoshibaoxiuView;


/**
 * 教室报修
 * 
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
public interface JiaoshibaoxiuDao extends BaseMapper<JiaoshibaoxiuEntity> {
	
	List<JiaoshibaoxiuVO> selectListVO(@Param("ew") Wrapper<JiaoshibaoxiuEntity> wrapper);
	
	JiaoshibaoxiuVO selectVO(@Param("ew") Wrapper<JiaoshibaoxiuEntity> wrapper);
	
	List<JiaoshibaoxiuView> selectListView(@Param("ew") Wrapper<JiaoshibaoxiuEntity> wrapper);

	List<JiaoshibaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshibaoxiuEntity> wrapper);

	
	JiaoshibaoxiuView selectView(@Param("ew") Wrapper<JiaoshibaoxiuEntity> wrapper);
	

}
