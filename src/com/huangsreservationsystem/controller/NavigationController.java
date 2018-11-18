package com.huangsreservationsystem.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NavigationController {

	private String pageId;

	public String showPage() {
		if (pageId == null) {
			return "home";
		}

		if (pageId.equals("1")) {
			return "page1";
		} else if (pageId.equals("2")) {
			return "page2";
		} else {
			return "home";
		}

	}
}
