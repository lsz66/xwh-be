package cn.szlee.xwh.service.impl;

import cn.szlee.xwh.mapper.DeptMapper;
import cn.szlee.xwh.mapper.MemberMapper;
import cn.szlee.xwh.model.po.Dept;
import cn.szlee.xwh.model.po.Member;
import cn.szlee.xwh.model.vo.DeptVO;
import cn.szlee.xwh.model.vo.MemberVO;
import cn.szlee.xwh.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<DeptVO> generateContacts() {
        List<DeptVO> voList = new ArrayList<>();
        // 查询部门信息
        List<Dept> deptList = deptMapper.selectList(null);
        // 将部门信息放到vo表中
        deptList.forEach(dept -> {
            DeptVO deptVO = new DeptVO();
            BeanUtils.copyProperties(dept, deptVO);
            voList.add(deptVO);
        });
        // 通过每个部门信息再去查询部门成员信息
        voList.forEach(deptVO -> {
            List<MemberVO> list = baseMapper.selectToVO(deptVO.getId());
            deptVO.setMemberInfo(list);
        });
        return voList;
    }
}
