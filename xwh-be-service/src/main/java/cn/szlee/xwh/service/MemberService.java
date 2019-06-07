package cn.szlee.xwh.service;

import cn.szlee.xwh.model.po.Member;
import cn.szlee.xwh.model.vo.DeptVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <b><code>MemberService</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/6/7 1:10.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.1.2-SNAPSHOT
 */
public interface MemberService extends IService<Member> {

    /**
     * 生成通讯录
     *
     * @return 通讯录
     */
    List<DeptVO> generateContacts();
}
