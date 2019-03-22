package priv.dengjl.user.dao;

import org.springframework.stereotype.Repository;

import priv.dengjl.user.bean.UmUser;

@Repository
public interface UmUserMapper {
	void addUmUser(UmUser umUser);
}