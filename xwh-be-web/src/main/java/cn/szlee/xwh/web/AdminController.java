package cn.szlee.xwh.web;

import cn.szlee.xwh.model.po.Admin;
import cn.szlee.xwh.service.AdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b><code>AdminController</code></b>
 * <p/>
 * 管理员控制器类
 * <p/>
 * <b>Creation Time:</b> 2019/6/2 14:54.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.0.1-SNAPSHOT
 */
@RestController
@RequestMapping("/admin")
@Api(tags = "AdminController")
public class AdminController {

    @Autowired
    private AdminService service;

    @PostMapping("/login")
    public boolean login(@RequestBody Admin admin) {
        return service.login(admin);
    }

    @PostMapping("/register")
    public void register(@RequestBody Admin admin) {
        service.add(admin);
    }
}
