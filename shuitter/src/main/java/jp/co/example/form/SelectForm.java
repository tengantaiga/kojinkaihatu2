package jp.co.example.form;

import java.sql.Date;
import java.util.List;

public class SelectForm {

    private String partyName;

    private String pass;

    private Date partyDate;
    private String partyPlace;
    private String partyCome;
    private String confirmPass;
    private List<String> friendList;
    private List<String> inviteList;
    private String loginId;

    public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public List<String> getInviteList() {
		return inviteList;
	}

	public void setInviteList(List<String> inviteList) {
		this.inviteList = inviteList;
	}

	public List<String> getFriendList() {
		return friendList;
	}

	public void setFriendList(List<String> friendList) {

		this.friendList = friendList;
	}

	public String getConfirmPass() {
		return confirmPass;
	}

	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}

	public Date getPartyDate() {
		return partyDate;
	}

	public void setPartyDate(Date partyDate) {
		this.partyDate = partyDate;
	}

	public String getPartyPlace() {
		return partyPlace;
	}

	public void setPartyPlace(String partyPlace) {
		this.partyPlace = partyPlace;
	}

	public String getPartyCome() {
		return partyCome;
	}

	public void setPartyCome(String partyCome) {
		this.partyCome = partyCome;
	}

	public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }




}
