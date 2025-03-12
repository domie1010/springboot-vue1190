package com.dao;

import com.entity.JiaoshimingchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshimingchengVO;
import com.entity.view.JiaoshimingchengView;


/**
 * 教室名称
 * 
 * @author 
 * @email 
 * @date 2024-03-19 13:32:24
 */
public interface JiaoshimingchengDao extends BaseMapper<JiaoshimingchengEntity> {
	
	List<JiaoshimingchengVO> selectListVO(@Param("ew") Wrapper<JiaoshimingchengEntity> wrapper);
	
	JiaoshimingchengVO selectVO(@Param("ew") Wrapper<JiaoshimingchengEntity> wrapper);
	
	List<JiaoshimingchengView> selectListView(@Param("ew") Wrapper<JiaoshimingchengEntity> wrapper);

	List<JiaoshimingchengView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshimingchengEntity> wrapper);

	
	JiaoshimingchengView selectView(@Param("ew") Wrapper<JiaoshimingchengEntity> wrapper);
	

}
