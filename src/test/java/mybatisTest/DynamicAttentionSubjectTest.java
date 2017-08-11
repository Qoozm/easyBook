package mybatisTest;

import com.xupt.bean.DynamicAttentionSubject;
import com.xupt.service.IAttentionSubjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:dispatcherServlet-servlet.xml"})
public class DynamicAttentionSubjectTest {

    @Autowired
    IAttentionSubjectService attentionSubjectService;

    @Test
    public void run() {
        List<DynamicAttentionSubject> dynamicAttentionSubjectList = attentionSubjectService.searchUserDynamicAttentionSubject(1);
        Collections.sort(dynamicAttentionSubjectList);
        System.out.println(dynamicAttentionSubjectList);
    }
}
