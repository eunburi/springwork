package aaa.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Alias("bDTO")
@Data
public class BoardDTO {
	
	MultipartFile mmff;

	int id, cnt, seq, lev, gid;
	String title, name, pw, upfile, content;
	Date regDate;
}
