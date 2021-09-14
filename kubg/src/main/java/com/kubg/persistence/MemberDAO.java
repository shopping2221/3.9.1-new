package com.kubg.persistence;

import com.kubg.domain.MemberVO;

public interface MemberDAO {
	
	public void signup(MemberVO vo) throws Exception;
	
}
