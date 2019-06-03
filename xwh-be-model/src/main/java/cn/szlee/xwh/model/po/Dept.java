package cn.szlee.xwh.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <b><code>Dept</code></b>
 * <p/>
 * 部门实体类
 * <p/>
 * <b>Creation Time:</b> 2019/6/4 0:30.
 *
 * @author 陈艾迪
 * @author 李尚哲
 * @since xwh-be 0.1.1-SNAPSHOT
 */
@Data
@ApiModel("部门实体类")
public class Dept {

    @ApiModelProperty("部门id")
    private int id;

    @ApiModelProperty("部门名字")
    private String name;

    @ApiModelProperty("部门简介")
    private String description;

    /**
     * 该部门是否能接受申请
     * 该字段决定了该部门是否能出现在提交申请页面上
     * <p>
     * 例如：摄影部能接受申请，会长团不接受申请
     */
    @ApiModelProperty("该部门是否能接受申请")
    private int acceptable;

    @ApiModelProperty("当前状态，默认为1，删除为0")
    private int status = 1;

    @ApiModelProperty("创建时间")
    private Date createTime;
}
