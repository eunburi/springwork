package aaa.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("pd")
@Data
public class PageData {
	
	String msg,goUrl;
	
	int limit = 3;  // 한 페이지에 표시할 항목의 수
	int pageLimit = 4; // 한 번에 4개의 페이지 번호를 표시하도록 설정
	int page, start, pageStart, pageEnd, total, pageTotal;
	
	
	
	public void calPaging() {
		
		//this.total = mapper.totalCnt();
		
		//전체페이지
        pageTotal = total / limit;
        //나머지있으면 한 페이지 더 필요
        if (total % limit > 0) {
            pageTotal++;
        }

        start = (page - 1) * limit; // 글 번호 시작 (id)
        
        //페이지 번호의 시작을 계산
        pageStart = ((page - 1) / pageLimit) * pageLimit + 1;
        pageEnd = pageStart + pageLimit - 1; //끝페이지
        
        //페이지 번호의 끝이 전체 페이지 수를 초과하지 않도록
        if (pageEnd > pageTotal) {
            pageEnd = pageTotal;
        }
    }
	
	

}
