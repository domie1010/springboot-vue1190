package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JieciDao;
import com.entity.JieciEntity;
import com.service.JieciService;
import com.entity.vo.JieciVO;
import com.entity.view.JieciView;

@Service("jieciService")
public class JieciServiceImpl extends ServiceImpl<JieciDao, JieciEntity> implements JieciService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JieciEntity> page = this.selectPage(
                new Query<JieciEntity>(params).getPage(),
                new EntityWrapper<JieciEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JieciEntity> wrapper) {
		  Page<JieciView> page =new Query<JieciView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JieciVO> selectListVO(Wrapper<JieciEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JieciVO selectVO(Wrapper<JieciEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JieciView> selectListView(Wrapper<JieciEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JieciView selectView(Wrapper<JieciEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
