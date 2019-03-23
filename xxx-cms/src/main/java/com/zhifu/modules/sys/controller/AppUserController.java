package com.zhifu.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhifu.modules.sys.entity.AppUserEntity;
import com.zhifu.modules.sys.service.AppUserService;
import com.zhifu.common.utils.PageUtils;
import com.zhifu.common.utils.R;



/**
 * 用户
 *
 * @author zhifu
 * @email anson.zhifu@gmail.com
 * @date 2018-11-25 10:00:49
 */
@RestController
@RequestMapping("sys/appuser")
public class AppUserController {
    @Autowired
    private AppUserService appUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:appuser:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = appUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    @RequiresPermissions("sys:appuser:info")
    public R info(@PathVariable("userId") Long userId){
			AppUserEntity user = appUserService.selectById(userId);

        return R.ok().put("user", user);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:appuser:save")
    public R save(@RequestBody AppUserEntity user){
			appUserService.insert(user);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:appuser:update")
    public R update(@RequestBody AppUserEntity user){
			appUserService.updateById(user);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:appuser:delete")
    public R delete(@RequestBody Long[] userIds){
			appUserService.deleteBatchIds(Arrays.asList(userIds));

        return R.ok();
    }

}
