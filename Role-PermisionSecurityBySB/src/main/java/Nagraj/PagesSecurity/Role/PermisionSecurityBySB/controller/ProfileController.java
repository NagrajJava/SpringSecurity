package Nagraj.PagesSecurity.Role.PermisionSecurityBySB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("profile")
public class ProfileController {
  @GetMapping("index")
  public String profile()
  {
	  return "profile/index";
  }
}
