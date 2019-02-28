package com.example.demo.mapper;

import com.example.demo.model.WxUser;

import java.util.*;

/**
 * @author ych
 *
 */
public abstract interface WxUserMapper {
	
//	public abstract List<WxUser> getWxUserListPage(WxUser wxUser);
	
	public abstract List<WxUser> getWxUserList(WxUser wxUser);
	
	public abstract WxUser getWxUserById(int id);

	public abstract int insertWxUser(WxUser wxUser);
	
	public abstract void insertWxUserBatch(List<WxUser> wxUsers);

	public abstract void updateWxUser(WxUser wxUser);

	public abstract void deleteWxUser(int id);
	
}
