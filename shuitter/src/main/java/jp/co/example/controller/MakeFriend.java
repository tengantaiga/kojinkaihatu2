package jp.co.example.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.example.dao.PartyDao;
import jp.co.example.dao.UserInfoDao;
import jp.co.example.entity.UserInfo;
import jp.co.example.form.SelectForm;

@Controller
public class MakeFriend {


	 @Autowired
	    MessageSource messageSource;

	    @Autowired
	    HttpSession session;

	    @Autowired
	    PartyDao partyDao;

	    @Autowired
	    private UserInfoDao userInfo;


	@RequestMapping("/make")
    public String select(@ModelAttribute("selectForm") SelectForm form, Model model) {

        return "userSearch";
    }

	@RequestMapping(value = "/makeFriend", params ="make", method = RequestMethod.POST)
    public String list(@Validated @ModelAttribute("selectForm") SelectForm form, BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "userSearch";
        }


        // 検索処理
        UserInfo user = userInfo.findByLoginId(form.getLoginId());

        if (user == null) {
            // 検索結果が無い場合
            String errMsg = messageSource.getMessage("select.error", null, Locale.getDefault());
            model.addAttribute("errMsg", errMsg);
            return "userSearch";
        } else {
            // 検索結果がある場合
        	UserInfo u = (UserInfo) session.getAttribute("user");

            userInfo.makeFriend(form.getLoginId(), u.getLoginId());


            return "friendResult";
        }

	}

        @RequestMapping(value = "/makeFriend", params = "back", method = RequestMethod.POST)
	    public String insertBack(@ModelAttribute("selectForm") SelectForm form, Model model) {




	        return "menu";
	    }



}