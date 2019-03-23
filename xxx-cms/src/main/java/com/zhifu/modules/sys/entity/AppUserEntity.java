package com.zhifu.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * 
 * @author zhifu
 * @email anson.zhifu@gmail.com
 * @date 2018-11-25 10:00:49
 */
@TableName("tb_user")
public class AppUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long userId;
	/**
	 * 用户编号，7-10位随机数
	 */
	private String userNo;
	/**
	 * 微信openid
	 */
	private String openid;
	/**
	 * 微信appid
	 */
	private String appid;
	/**
	 * 微信unionid
	 */
	private String unionid;
	/**
	 * 用户名==手机号
	 */
	private String username;
	/**
	 * 用户昵称
	 */
	private String nickname;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 头像
	 */
	private String avatarUrl;
	/**
	 * 0=未知，1=男，2=女
	 */
	private Integer gender;
	/**
	 * 国家
	 */
	private String country;
	/**
	 * 省份
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 0=未删除，1=删除
	 */
	private Integer deleted;

	/**
	 * 设置：
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：用户编号，7-10位随机数
	 */
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	/**
	 * 获取：用户编号，7-10位随机数
	 */
	public String getUserNo() {
		return userNo;
	}
	/**
	 * 设置：微信openid
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	/**
	 * 获取：微信openid
	 */
	public String getOpenid() {
		return openid;
	}
	/**
	 * 设置：微信appid
	 */
	public void setAppid(String appid) {
		this.appid = appid;
	}
	/**
	 * 获取：微信appid
	 */
	public String getAppid() {
		return appid;
	}
	/**
	 * 设置：微信unionid
	 */
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	/**
	 * 获取：微信unionid
	 */
	public String getUnionid() {
		return unionid;
	}
	/**
	 * 设置：用户名==手机号
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户名==手机号
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：用户昵称
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取：用户昵称
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置：手机号
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：手机号
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置：邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：邮箱
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：头像
	 */
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	/**
	 * 获取：头像
	 */
	public String getAvatarUrl() {
		return avatarUrl;
	}
	/**
	 * 设置：0=未知，1=男，2=女
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	/**
	 * 获取：0=未知，1=男，2=女
	 */
	public Integer getGender() {
		return gender;
	}
	/**
	 * 设置：国家
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * 获取：国家
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * 设置：省份
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 获取：省份
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 设置：城市
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：城市
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：0=未删除，1=删除
	 */
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	/**
	 * 获取：0=未删除，1=删除
	 */
	public Integer getDeleted() {
		return deleted;
	}
}
