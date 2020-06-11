package jp.co.example.dao;

import java.util.List;

import jp.co.example.entity.Friend;
import jp.co.example.entity.Invite;
import jp.co.example.entity.UserInfo;

/*
 * user_infoテーブル用DAO (インターフェース)
 */
public interface UserInfoDao {

    public List<UserInfo> findAll();

    public List<UserInfo> find(UserInfo userInfo);

    public UserInfo findByLoginId(String loginId);

    public UserInfo findByLoginIdAndPassword(String loginId, String password);

    public void insert(UserInfo user);

	public List<Friend> findByName(String lodinId);

	public void inviteFriend(Invite invite);

	List<Invite> inviteList(String loginId);

	UserInfo findLoginId(String name);

	void makeFriend(String loginId, String floginId);

	void delete(String loginId,String partyName);
}
