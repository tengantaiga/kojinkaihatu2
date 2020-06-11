package jp.co.example.entity;

public class Invite {

	private Integer inviteId;
	private String partyName;
	private String loginId;



	public Invite(Integer inviteId, String partyName, String loginId) {
		super();
		this.inviteId = inviteId;
		this.partyName = partyName;
		this.loginId = loginId;
	}


	public Invite() {
		super();

	}


	public Integer getInviteId() {
		return inviteId;
	}
	public void setInviteId(Integer inviteId) {
		this.inviteId = inviteId;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

}
