import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ms.User.Service.UserService;
import com.ms.domain.User;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:applicationContext.xml"})  
public class text {
	 @Resource(name="userServiceImp")  
	    private UserService userService;
	 @Resource(name="user")
	 	private User user;
	 
	 @Test
	 public void text1(){
		 user.setUserName("lplplp");
		 user.setUserName("hi");
		 //userService.addUser(user);
	 }
}
