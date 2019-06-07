package cn.szlee.xwh.web;

import cn.szlee.xwh.model.vo.DeptVO;
import cn.szlee.xwh.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <b><code>MemberController</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/6/7 12:25.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.2.0-RELEASE
 */
@RestController
@RequestMapping("/v1.0/api/member")
@Api(tags = "MemberController")
public class MemberController {

    @Autowired
    private MemberService service;

    @GetMapping("/contacts")
    @ApiOperation("获取通讯录")
    public List<DeptVO> getContacts() {
        return service.generateContacts();
    }
}
