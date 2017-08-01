package mybatisTest;

import com.xupt.bean.User;
import com.xupt.dao.IUserDao;
import com.xupt.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by colin on 2017/7/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:dispatcherServlet-servlet.xml"})
public class UserDaoTest {

    @Autowired
    private IUserService userService;

    @Autowired
    private IUserDao userDao;

    @Test
    public void run() {
        User user = new User();
        user.setUser_age(15);
        user.setUser_description("lalala");
        user.setUser_email("1231@qq.com");
        user.setUser_essay_thumb(10000);
        user.setUser_fans(100);
        user.setUser_head_icon_path("111");
        user.setUser_name("李四");
        user.setUser_password("123");
        user.setUser_phone("18706728861");
        user.setUser_sex("男");

//        userDao.saveUser(user);
//        userDao.findHotUser();
        userService.loadHotAuthor();
    }
}
