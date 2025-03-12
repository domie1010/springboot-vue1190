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


import com.dao.JiaoshibaoxiuDao;
import com.entity.JiaoshibaoxiuEntity;
import com.service.JiaoshibaoxiuService;
import com.entity.vo.JiaoshibaoxiuVO;
import com.entity.view.JiaoshibaoxiuView;

@Service("jiaoshibaoxiuService")
public class JiaoshibaoxiuServiceImpl extends ServiceImpl<JiaoshibaoxiuDao, JiaoshibaoxiuEntity> implements JiaoshibaoxiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshibaoxiuEntity> page = this.selectPage(
                new Query<JiaoshibaoxiuEntity>(params).getPage(),
                new EntityWrapper<JiaoshibaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshibaoxiuEntity> wrapper) {
		  Page<JiaoshibaoxiuView> page =new Query<JiaoshibaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JiaoshibaoxiuVO> selectListVO(Wrapper<JiaoshibaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshibaoxiuVO selectVO(Wrapper<JiaoshibaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshibaoxiuView> selectListView(Wrapper<JiaoshibaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshibaoxiuView selectView(Wrapper<JiaoshibaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
