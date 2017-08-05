package mybatisTest;

import com.xupt.bean.Essay;
import com.xupt.dao.IEssayDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by colin on 2017/7/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:dispatcherServlet-servlet.xml"})
public class EssayDaoTest {

    @Autowired
    IEssayDao essayDao;

    @Test
    public void run() {
        Essay essay = new Essay();

        essay.setEssay_content_path(new String("qwerieurwr"));
        essay.setEssay_pubDate(new Date());
        essay.setEssay_thumb(10000);
        essay.setEssay_title(new String("王者荣耀"));
        essay.setEssay_visits(10);
        essay.setEssay_user_id(1);
        essay.setEssay_category_id(2);

        essayDao.save(essay);
//        essayDao.deleteById(1);
//        System.out.println(essay.getEssay_id());
    }
}
