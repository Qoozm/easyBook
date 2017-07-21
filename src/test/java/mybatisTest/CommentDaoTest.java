package mybatisTest;

import com.xupt.bean.Comment;
import com.xupt.dao.ICommentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by colin on 2017/7/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:dispatcherServlet-servlet.xml"})
public class CommentDaoTest {

    @Autowired
    ICommentDao commentDao;

    @Test
    public void run() {
        Comment comment = new Comment();

        comment.setComment_content(new String("123456").getBytes());
        comment.setComment_date(new Date());
        comment.setComment_essay_id(1);
        comment.setComment_floor(1);
        comment.setComment_from_user_id(2);
        comment.setComment_thumb(10);
        comment.setComment_to_user_id(2);

        String commentTableName = "ebcomment_0";
        commentDao.saveComment(commentTableName, comment);
    }
}
