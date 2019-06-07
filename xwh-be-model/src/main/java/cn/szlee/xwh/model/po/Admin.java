package cn.szlee.xwh.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <b><code>Admin</code></b>
 * <p/>
 * 管理员持久化对象
 * <p/>
 * <b>Creation Time:</b> 2019/6/2 14:47.
 *
 * @author 陈艾迪
 * @author 李尚哲
 * @since xwh-be 0.0.1-SNAPSHOT
 */
@Data
@ApiModel("管理员实体对象")
public class Admin {

    @ApiModelProperty("管理员id")
    private Integer id;

    @ApiModelProperty("管理员登录名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("管理员姓名")
    private String name;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("上次登录时间")
    private Date lastLoginTime;

    @ApiModelProperty("该账户状态")
    private Integer status = 1;
}
