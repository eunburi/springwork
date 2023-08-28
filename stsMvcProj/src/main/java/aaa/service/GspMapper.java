package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;
import aaa.model.GspDTO;

@Mapper
public interface GspMapper {
	
	List<GspDTO> list();
	
	BoardDTO detail(int id);

}
