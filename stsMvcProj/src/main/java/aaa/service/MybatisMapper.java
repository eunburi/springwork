package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;
import aaa.model.BoardDTOs;

@Mapper
public interface MybatisMapper {

	List<BoardDTO> list();
	
	List<BoardDTO> listSch(BoardDTO dto);
	
	List<BoardDTO> cntSch(BoardDTO dto);
	
	
	int insseerr(BoardDTO dto);
	
	
	int insseerrList(List list);
	
	int insseerrDTOs(BoardDTOs dtos);
	
	//여러개의 매개변수를 처리시 xml 에서는 매개변수 이름으로 접근
	int delettt(int id, String pw);
	
	//parameterType="map" 인 경우 매개변수를  map으로 묶어 key, value형태로 접근 
	int modifffy(int id, String pw, String pname, String content,String title);
	
	
	
}
