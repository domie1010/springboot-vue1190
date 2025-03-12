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


import com.dao.WeihuyuanDao;
import com.entity.WeihuyuanEntity;
import com.service.WeihuyuanService;
import com.entity.vo.WeihuyuanVO;
import com.entity.view.WeihuyuanView;

@Service("weihuyuanService")
public class WeihuyuanServiceImpl extends ServiceImpl<WeihuyuanDao, WeihuyuanEntity> implements WeihuyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeihuyuanEntity> page = this.selectPage(
                new Query<WeihuyuanEntity>(params).getPage(),
                new EntityWrapper<WeihuyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeihuyuanEntity> wrapper) {
		  Page<WeihuyuanView> page =new Query<WeihuyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<WeihuyuanVO> selectListVO(Wrapper<WeihuyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeihuyuanVO selectVO(Wrapper<WeihuyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeihuyuanView> selectListView(Wrapper<WeihuyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeihuyuanView selectView(Wrapper<WeihuyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
