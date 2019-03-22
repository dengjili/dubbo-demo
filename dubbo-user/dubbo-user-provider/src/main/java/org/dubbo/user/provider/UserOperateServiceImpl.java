package org.dubbo.user.provider;

import java.util.UUID;

import org.dubbo.user.api.IUserOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import priv.dengjl.user.bean.UmUser;
import priv.dengjl.user.dao.UmUserMapper;

@Service
public class UserOperateServiceImpl implements IUserOperateService {
	
	@Autowired
	private UmUserMapper umUserMapper;

	@Override
	public String createUser(String name) {
		String id = UUID.randomUUID().toString();
		UmUser umUser = new UmUser();
		umUser.setId(id);
		umUser.setName(name);
		umUserMapper.addUmUser(umUser);
		return id;
	}

}
