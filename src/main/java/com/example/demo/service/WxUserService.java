package com.example.demo.service;

import com.example.demo.model.WxUser;

import java.util.*;

/**
 * @author ych
 *
 */
public abstract interface WxUserService {
	
//	public abstract List<WxUser> getWxUserListPage(WxUser wxUser);
	
	public abstract List<WxUser> getWxUserList(WxUser wxUser);
	
	public abstract WxUser getWxUserById(int id);
	
	public abstract int saveWxUser(WxUser wxUser, String doWhat);
	
	public abstract void insertWxUserBatch(List<WxUser> wxUsers);

	public abstract void deleteWxUser(int id);
	
}