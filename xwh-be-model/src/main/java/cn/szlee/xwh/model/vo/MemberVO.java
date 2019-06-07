package cn.szlee.xwh.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <b><code>MemberVO</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/6/7 11:11.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.2.0-SNAPSHOT
 */
@Data
@ApiModel("成员vo类")
public class MemberVO {

    @ApiModelProperty("成员id")
    private Integer id;

    @ApiModelProperty("职位")
    private String positionName;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("班别")
    private String clazz;

    @ApiModelProperty("电话")
    private String phone;
}
