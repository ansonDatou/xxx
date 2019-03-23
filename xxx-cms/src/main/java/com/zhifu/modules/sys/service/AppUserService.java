package com.zhifu.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.zhifu.common.utils.PageUtils;
import com.zhifu.modules.sys.entity.AppUserEntity;

import java.util.Map;

/**
 * 用户
 *
 * @author zhifu
 * @email anson.zhifu@gmail.com
 * @date 2018-11-25 10:00:49
 */
public interface AppUserService extends IService<AppUserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

