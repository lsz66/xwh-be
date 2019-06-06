package cn.szlee.xwh.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <b><code>Member</code></b>
 * <p/>
 * 机构成员实体类
 * <p/>
 * <b>Creation Time:</b> 2019/6/4 0:41.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.1.1-SNAPSHOT
 */
@Data
@ApiModel("机构成员实体类")
public class Member {

    @ApiModelProperty("成员id")
    private int id;

    @ApiModelProperty("部门id")
    private int deptId;

    @ApiModelProperty("职位id")
    private int positionId;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("电话")
    private String phone;
}
