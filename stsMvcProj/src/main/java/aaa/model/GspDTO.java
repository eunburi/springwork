package aaa.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
@Alias("gDTO")
@Data
public class GspDTO {
	
	MultipartFile mmff2;
	
	int id, cnt, seq, lev, gid;
	String title, pname, pw, upfile, content;
	Date regDate;
}