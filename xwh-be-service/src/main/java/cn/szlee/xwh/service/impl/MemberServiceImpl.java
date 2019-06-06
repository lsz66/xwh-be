package cn.szlee.xwh.service.impl;

import cn.szlee.xwh.mapper.MemberMapper;
import cn.szlee.xwh.model.po.Member;
import cn.szlee.xwh.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <b><code>MemberServiceImpl</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/6/7 1:20.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.1.2-SNAPSHOT
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {
}
