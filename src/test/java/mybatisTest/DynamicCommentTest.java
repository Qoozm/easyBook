package mybatisTest;

import com.xupt.service.ICommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:dispatcherServlet-servlet.xml"})
public class DynamicCommentTest {
    @Autowired
    private ICommentService commentService;

    @Test
    public void run() {
        System.out.println(commentService.searchDynamicComment(1));
    }
}
