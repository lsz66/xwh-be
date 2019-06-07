package cn.szlee.xwh.mapper;

import cn.szlee.xwh.model.vo.MemberVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * <b><code>MemberMapperTest</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/6/7 12:13.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.2.0-SNAPSHOT
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberMapperTest {

    @Autowired
    private MemberMapper mapper;

    @Test
    public void testSelectToVO() {
        List<MemberVO> list = mapper.selectToVO(2);
        list.forEach(System.out::println);
    }
}
