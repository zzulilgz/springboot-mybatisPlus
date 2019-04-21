package com.example.mybatisplus.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzulilgz
 * @since 2019-04-20
 */
public class PowerUser extends Model<PowerUser> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 登录名称
     */
	private String loginName;
    /**
     * 登录密码
     */
	private String password;
    /**
     * 最后登录时间
     */
	private LocalDateTime lastLoginTime;
    /**
     * 创建时间
     */
	private LocalDateTime createTime;
    /**
     * 头像
     */
	private String photoUrl;
    /**
     * 用户名称
     */
	private String userName;
    /**
     * 备注
     */
	private String remark;
    /**
     * 更新时间
     */
	private LocalDateTime updateTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(LocalDateTime lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "PowerUser{" +
			", id=" + id +
			", loginName=" + loginName +
			", password=" + password +
			", lastLoginTime=" + lastLoginTime +
			", createTime=" + createTime +
			", photoUrl=" + photoUrl +
			", userName=" + userName +
			", remark=" + remark +
			", updateTime=" + updateTime +
			"}";
	}
}
