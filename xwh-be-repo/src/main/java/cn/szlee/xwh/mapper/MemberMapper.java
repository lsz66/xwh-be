package cn.szlee.xwh.mapper;

import cn.szlee.xwh.model.po.Member;
import cn.szlee.xwh.model.vo.MemberVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <b><code>MemberMapper</code></b>
 * <p/>
 * 成员Mapper
 * <p/>
 * <b>Creation Time:</b> 2019/6/7 1:03.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.1.2-SNAPSHOT
 */
public interface MemberMapper extends BaseMapper<Member> {

    /**
     * 根据部门id查询生成成员vo类
     *
     * @param deptId 部门id
     * @return 成员vo
     */
    @Select("SELECT m.id, position_name, name, clazz, phone \n" +
            "FROM member m \n" +
            "INNER JOIN position p ON position_id = p.id \n" +
            "WHERE dept_id = #{deptId} \n" +
            "ORDER BY position_id")
    List<MemberVO> selectToVO(int deptId);
}
