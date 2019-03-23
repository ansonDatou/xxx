package com.zhifu.modules.sys.dao;

import com.zhifu.modules.sys.entity.AppUserEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * 
 * @author zhifu
 * @email anson.zhifu@gmail.com
 * @date 2018-11-25 10:00:49
 */
@Mapper
public interface AppUserDao extends BaseMapper<AppUserEntity> {
	
}
