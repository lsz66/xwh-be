package cn.szlee.xwh.service;

import cn.szlee.xwh.model.vo.DeptVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * <b><code>MemberServiceTest</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/6/7 11:29.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.2.0-SNAPSHOT
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberServiceTest {

    @Autowired
    private MemberService service;

    @Test
    public void testGenerateContacts() {
        List<DeptVO> list = service.generateContacts();
        list.forEach(System.out::println);
    }
}
