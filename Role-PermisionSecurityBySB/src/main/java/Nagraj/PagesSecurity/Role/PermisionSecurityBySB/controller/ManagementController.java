package Nagraj.PagesSecurity.Role.PermisionSecurityBySB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("management")
public class ManagementController 
{
   @GetMapping("index")
   public String index()
   {
	   
	   return "management/index";
   }
}
