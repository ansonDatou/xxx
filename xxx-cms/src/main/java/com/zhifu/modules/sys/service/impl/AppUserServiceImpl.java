package com.zhifu.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhifu.common.utils.PageUtils;
import com.zhifu.common.utils.Query;

import com.zhifu.modules.sys.dao.AppUserDao;
import com.zhifu.modules.sys.entity.AppUserEntity;
import com.zhifu.modules.sys.service.AppUserService;


@Service("appUserService")
public class AppUserServiceImpl extends ServiceImpl<AppUserDao, AppUserEntity> implements AppUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AppUserEntity> page = this.selectPage(
                new Query<AppUserEntity>(params).getPage(),
                new EntityWrapper<AppUserEntity>()
        );

        return new PageUtils(page);
    }

}
