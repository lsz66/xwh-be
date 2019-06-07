package cn.szlee.xwh.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * <b><code>DeptVO</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/6/7 10:58.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.2.0-SNAPSHOT
 */
@Data
@ApiModel("部门vo类，包含该部门内成员信息")
public class DeptVO {

    @ApiModelProperty("部门id")
    private Integer id;

    @ApiModelProperty("部门名")
    private String deptName;

    @ApiModelProperty("成员信息")
    private List<MemberVO> memberInfo;
}
