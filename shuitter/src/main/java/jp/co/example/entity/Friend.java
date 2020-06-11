package jp.co.example.entity;

public class Friend {

	private Integer friendId;
	private String loginId;
	private String floginId;
	private String userName;




	public Friend() {
		super();

	}



	public Friend(Integer friendId, String loginId, String floginId, String userName) {
		super();
		this.friendId = friendId;
		this.loginId = loginId;
		this.floginId = floginId;
		this.userName = userName;
	}



	public Friend(Integer friendId, String loginId, String floginId) {
		super();
		this.friendId = friendId;
		this.loginId = loginId;
		this.floginId = floginId;
	}
	public Integer getFriendId() {
		return friendId;
	}
	public void setFriendId(Integer friendId) {
		this.friendId = friendId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getFloginId() {
		return floginId;
	}
	public void setFloginId(String floginId) {
		this.floginId = floginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
