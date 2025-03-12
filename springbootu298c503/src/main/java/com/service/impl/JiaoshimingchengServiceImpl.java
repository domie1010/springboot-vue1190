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


import com.dao.JiaoshimingchengDao;
import com.entity.JiaoshimingchengEntity;
import com.service.JiaoshimingchengService;
import com.entity.vo.JiaoshimingchengVO;
import com.entity.view.JiaoshimingchengView;

@Service("jiaoshimingchengService")
public class JiaoshimingchengServiceImpl extends ServiceImpl<JiaoshimingchengDao, JiaoshimingchengEntity> implements JiaoshimingchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshimingchengEntity> page = this.selectPage(
                new Query<JiaoshimingchengEntity>(params).getPage(),
                new EntityWrapper<JiaoshimingchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshimingchengEntity> wrapper) {
		  Page<JiaoshimingchengView> page =new Query<JiaoshimingchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JiaoshimingchengVO> selectListVO(Wrapper<JiaoshimingchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshimingchengVO selectVO(Wrapper<JiaoshimingchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshimingchengView> selectListView(Wrapper<JiaoshimingchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshimingchengView selectView(Wrapper<JiaoshimingchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
