package jp.co.example.entity;

import java.io.Serializable;

/**
 * セッション情報を纏めて管理するためのクラス
 */
public class SessionInfo implements Serializable {
    UserInfo loginUser; // ログインユーザ情報
    UserInfo registerUser; // 登録画面で入力したユーザ情報
    UserInfo prevUpdateUser; // 更新画面で取得した更新前のユーザ情報
    UserInfo updateUser; // 更新画面で入力したユーザ情報
    Party party;

    public void setParty(Party party) {
    	this.party = party;
    }

    public Party getParty() {
        return party;
    }



    /**
     * ログインユーザ情報設定
     */
    public void setLoginUser(UserInfo _loginUser) {
        loginUser = _loginUser;
    }

    /**
     * ログインユーザ情報取得
     */
    public UserInfo getLoginUser() {
        return loginUser;
    }



    /**
     * 登録画面で入力したユーザ情報設定
     */
    public void setRegisterUser(UserInfo _registerUser) {
        registerUser = _registerUser;
    }

    /**
     * 登録画面で入力したユーザ情報取得
     */
    public UserInfo getRegisterUser() {
        return registerUser;
    }

    /**
     * 更新画面で取得した更新前のユーザ情報設定
     */
    public void setPrevUpdateUser(UserInfo _prevUpdateUser) {
        prevUpdateUser = _prevUpdateUser;
    }

    /**
     * 更新画面で取得した更新前のユーザ情報取得
     */
    public UserInfo getPrevUpdateUser() {
        return prevUpdateUser;
    }

    /**
     * 更新画面で入力したユーザ情報設定
     */
    public void setUpdateUser(UserInfo _updateUser) {
        updateUser = _updateUser;
    }

    /**
     * 更新画面で入力したユーザ情報取得
     */
    public UserInfo getUpdateUser() {
        return updateUser;
    }
}
