package com.iu.s2.member;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s2.MyTestCase;

public class MemberDAOTeat extends MyTestCase {

	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void MemberTest() throws Exception {
		List<MemberDTO> ar = memberDAO.getMemberList();
		assertNotEquals(0, ar.size());
	}

}
