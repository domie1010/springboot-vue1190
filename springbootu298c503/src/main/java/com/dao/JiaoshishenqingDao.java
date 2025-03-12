package com.dao;

import com.entity.JiaoshishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshishenqingVO;
import com.entity.view.JiaoshishenqingView;


/**
 * 教师申请
 * 
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
public interface JiaoshishenqingDao extends BaseMapper<JiaoshishenqingEntity> {
	
	List<JiaoshishenqingVO> selectListVO(@Param("ew") Wrapper<JiaoshishenqingEntity> wrapper);
	
	JiaoshishenqingVO selectVO(@Param("ew") Wrapper<JiaoshishenqingEntity> wrapper);
	
	List<JiaoshishenqingView> selectListView(@Param("ew") Wrapper<JiaoshishenqingEntity> wrapper);

	List<JiaoshishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshishenqingEntity> wrapper);

	
	JiaoshishenqingView selectView(@Param("ew") Wrapper<JiaoshishenqingEntity> wrapper);
	

}
