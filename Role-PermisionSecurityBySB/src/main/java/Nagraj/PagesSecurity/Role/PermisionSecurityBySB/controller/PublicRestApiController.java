package Nagraj.PagesSecurity.Role.PermisionSecurityBySB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("public/api")
public class PublicRestApiController
{
	@GetMapping("/test1")
	  public String Test()
	  {
		  return "API-TEST";
	  }
		@GetMapping("/test2")
		public String Test2()
		{
			return "API-TEST2";
		}
}
