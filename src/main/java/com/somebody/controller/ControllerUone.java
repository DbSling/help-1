package com.somebody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.somebody.serviece.auth.Authenticaion;
import com.somebody.serviece.equimpment.Equipment;
import com.somebody.serviece.lesson.Lesson;
import com.somebody.serviece.member.Member;
import com.somebody.serviece.pay.Pay;
import com.somebody.serviece.staff.Staff;

import beans.Members;

@Controller 
public class ControllerUone {
	@Autowired
	Member me;
	
	@RequestMapping(value = "/infoLine", method = RequestMethod.GET)
	public void infoLine(Model model, @ModelAttribute Members me) {
		this.me.backController("C01",me, model);
	}
	@RequestMapping(value = "/meLessonMg", method = RequestMethod.POST)
	public void meLessonMg(Model model, @ModelAttribute Members me) {
		this.me.backController("C07", me, model);
	}
	@RequestMapping(value = "/meConfig", method = RequestMethod.POST)
	public void meConfig(Model model, @ModelAttribute Members me) {
		this.me.backController("C12",me, model);
	}
	@RequestMapping(value = "/delMe", method = RequestMethod.POST)
	public void delMe(Model model, @ModelAttribute Members me) {
		this.me.backController("C17",me, model);
	}
	
}
