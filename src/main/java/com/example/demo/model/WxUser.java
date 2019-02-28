package com.example.demo.model;



import java.io.Serializable;


/**
 * @author ych
 *
 */
public class WxUser implements Serializable{	

	private static final long serialVersionUID = -3885313706621697914L;
	//columns START
	/** id */
	private Integer id;
	/** userName */
	private String userName;
	/** passWord */
	private String passWord;
	/** phoneNo */
	private String phoneNo;
	/** state */
	private String state;
	/** openid */
	private String openid;
	/** auth */
	private String auth;
	/** createTime */
	private java.util.Date createTime;
	/** updateTime */
	private java.util.Date updateTime;
	//columns END


	/**
	 * 设置 id
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * id
	 * @return
	 */
	public Integer getId() {
		return this.id;
	}
	/**
	 * 设置 userName
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * userName
	 * @return
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * 设置 passWord
	 * @param passWord
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	/**
	 * passWord
	 * @return
	 */
	public String getPassWord() {
		return this.passWord;
	}
	/**
	 * 设置 phoneNo
	 * @param phoneNo
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * phoneNo
	 * @return
	 */
	public String getPhoneNo() {
		return this.phoneNo;
	}
	/**
	 * 设置 state
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * state
	 * @return
	 */
	public String getState() {
		return this.state;
	}
	/**
	 * 设置 openid
	 * @param openid
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	/**
	 * openid
	 * @return
	 */
	public String getOpenid() {
		return this.openid;
	}
	/**
	 * 设置 auth
	 * @param auth
	 */
	public void setAuth(String auth) {
		this.auth = auth;
	}
	/**
	 * auth
	 * @return
	 */
	public String getAuth() {
		return this.auth;
	}
	/**
	 * 设置 createTime
	 * @param createTime
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * createTime
	 * @return
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * 设置 updateTime
	 * @param updateTime
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * updateTime
	 * @return
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}


}

