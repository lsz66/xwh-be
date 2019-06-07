package cn.szlee.xwh.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <b><code>Position</code></b>
 * <p/>
 * 职位实体类
 * <p/>
 * <b>
 * ！！注意！！
 * </b>
 * <p>
 * 本表（持久类）仅用于标识人员职位，用于前端页面渲染</p>
 * <b>本机构拒绝各种形式的官僚主义</b>
 * <p>在联系人表渲染时，职位id靠前的将会先被渲染</p>
 * 例如：部长的职位id为5，副部长职位id为6，干事职位id为7，
 * 则在渲染时会先展示部长再展示副部长最后展示干事
 * <p/>
 * <b>Creation Time:</b> 2019/6/7 0:37.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.1.2-SNAPSHOT
 */
@Data
@ApiModel("职位实体类。声明：本机构拒绝任何官僚主义作风，此实体类仅做联系人表格渲染用 ")
public class Position {

    @ApiModelProperty("职位id")
    private Integer id;

    @ApiModelProperty("职位名称")
    private String positionName;
}
