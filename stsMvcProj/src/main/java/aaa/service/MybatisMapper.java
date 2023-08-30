package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;

@Mapper
public interface MybatisMapper {

	List<BoardDTO> list();
	
	List<BoardDTO> listSch(BoardDTO dto);
	
	List<BoardDTO> cntSch(BoardDTO dto);
	
	BoardDTO detail(int id);
	
	int insseerr(BoardDTO dto);
	
	int delettt(BoardDTO dto);
	
	int modifffy(BoardDTO dto);
	
	int listCnt();
	
	int maxId();
	
	void addCount(int id);
	
	int fileDelete(BoardDTO dto);
	
	int idPwChk(BoardDTO dto);
	
}
