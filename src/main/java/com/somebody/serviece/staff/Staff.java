package com.somebody.serviece.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.servlet.ModelAndView;

import com.somebody.db.CommonMethod;
import com.somebody.db.MapperBon;
import com.somebody.db.MapperDong;
import com.somebody.db.MapperUone;
import com.somebody.db.MapperYoung;

import beans.Staffs;
import kr.co.icia.plzec.services.Encryption;
import kr.co.icia.plzec.services.ProjectUtils;

@Service
public class Staff extends CommonMethod{
	@Autowired
	private MapperBon mb;
	@Autowired
	private MapperDong md;
	@Autowired
	private MapperYoung my;
	@Autowired
	private MapperUone mu;
	private ModelAndView mav;
	@Autowired
	private ProjectUtils pu;
	@Autowired
	private Encryption enc;
	@Autowired
	private DataSourceTransactionManager tx;

	private TransactionStatus txStatus;

	private DefaultTransactionDefinition txdef;

	String page = null;
	public void backController(String sCode, Staffs sf) {
		String gs = null;
		String senddata = null;

		switch (sCode) {
		case "S01":
			sfMg(sf);
			 break;
		case "S02":
			searchSfMg(sf);
			break;
		case "S03":
			getMaxSf(sf);
			break;
		case "S04":
			insSf(sf);
			break;
		case "S07":
			modSf(sf);
			break;
		case "S09":
			getMeMg(sf);
			break;
		
		}
		
	}

	public void sfMg(Staffs sf) {
		
		
	}

	public void searchSfMg(Staffs sf) {
		
		
	}

	public void getMaxSf(Staffs sf) {
		
		
	}

	public void insSf(Staffs sf) {
		
		
	}

	public void modSf(Staffs sf) {
		
		
	}

	public void getMeMg(Staffs sf) {
		
		
	}

}
