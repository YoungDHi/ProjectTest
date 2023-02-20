package com.iu.s2.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.s2.notice.NoticeDAO.";
	
	//공지 리스트 조회
	public List<NoticeDTO> getNoticeList() throws Exception {
		return sqlSession.selectList(NAMESPACE+"getNoticeList");
	}
	
	//공지 상세 조회
	public NoticeDTO getNoticeDetail(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getNoticeDetail", noticeDTO);
	}
	
	//공지 작성
	public int setNoticeAdd(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setNoticeAdd", noticeDTO);
	}
	
	//공지 수정
	public int setNoticeUpdate(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"setNoticeUpdate", noticeDTO);
	}
	
	//공지 삭제
	public int setNoticeDelete(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"setNoticeDelete", noticeDTO);
	}
	
	//파일 경로 저장
	public int setNoticeImgAdd(NoticeImgDTO noticeImgDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setNoticeImgAdd", noticeImgDTO);
	}
	
	//파일 경로 삭제
	
	public int setNoticeImgDelete(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"setNoticeImgDelete", noticeDTO);
	}

}
