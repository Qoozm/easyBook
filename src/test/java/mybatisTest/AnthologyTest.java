package mybatisTest;

import com.xupt.dao.IEssayDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:dispatcherServlet-servlet.xml"})
public class AnthologyTest {

    @Autowired
    private IEssayDao essayDao;

    @Test
    public void run() {
        Integer essay_anthology_id = 1;

        essayDao.findUserAnthologyEssayInfo(essay_anthology_id);
    }
}
