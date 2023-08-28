package aaa.controll;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.GspDTO;
import aaa.service.GspMapper;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("gsp")
public class GspController {
	
	@Resource
	GspMapper mp;
	
	@RequestMapping("list")
	String list(Model mm) {
		
		List<GspDTO>dataa = mp.list();
		System.out.println("dataa" + dataa);
		mm.addAttribute("main",dataa);
		
		return "gsp/list"; // 연결성공!
	}
	
//	@RequestMapping("detail/{id}")
//	String detail(Model mm, @PathVariable int id) {
//		
//		mm.addAttribute("dto", mp.detail(id));
//		return "gsp/detail";
//	}

}
