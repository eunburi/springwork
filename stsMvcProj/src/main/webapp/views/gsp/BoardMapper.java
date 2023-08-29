package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;
import aaa.model.PageData;

@Mapper // 정의해놓은 sql와 개발할 때 사용하는 메소드를 연결하고 결과 값을 정의해놓은 타입으로 매핑 시켜주는 것
public interface BoardMapper {
	
	List<BoardDTO> list(PageData pd);
	//첫페이지 마지막페이지 뽑음
	//BoardDTO" 객체로 이루어진 목록(List)을 반환
	//"list()"는 메서드의 이름 메서드를 호출할 때 "list()"라고 지정하면 해당 메서드가 실행
	
	BoardDTO detail(int id);
	
	int insseerr(BoardDTO dto);
	
	int delettt(BoardDTO dto);
	
	int modifffy(BoardDTO dto);
	
	int totalCnt(); // 토탈
	
	
	
	
	

}
