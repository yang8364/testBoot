package com.example.demo.service.impr;

import com.example.demo.mapper.WxUserMapper;
import com.example.demo.model.WxUser;
import com.example.demo.service.WxUserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;



/**
 * @author ych
 *
 */

@Service("wxUserService")
public class WxUserServiceImpl implements WxUserService {
	@Autowired
	private WxUserMapper wxUserMapper;
	
//	@Override
//	public List<WxUser> getWxUserListPage(WxUser wxUser){
//		return wxUserMapper.getWxUserListPage(wxUser);
//	}
	
	@Override
	public List<WxUser> getWxUserList(WxUser wxUser){
		return wxUserMapper.getWxUserList(wxUser);
	}
	
	@Override
	public WxUser getWxUserById(int id){
		return wxUserMapper.getWxUserById(id);
	}

	@Override
	public int saveWxUser(WxUser wxUser,String doWhat){
		if("add".equals(doWhat)){
			return wxUserMapper.insertWxUser(wxUser);
		}else if("edit".equals(doWhat)){
			wxUserMapper.updateWxUser(wxUser);
		}		
		return 0;
  	
	}
	
	@Override
	public void insertWxUserBatch(List<WxUser> wxUsers){
		wxUserMapper.insertWxUserBatch(wxUsers);
	}
	
	@Override
	public void deleteWxUser(int id){
		wxUserMapper.deleteWxUser(id);
	}
	
}