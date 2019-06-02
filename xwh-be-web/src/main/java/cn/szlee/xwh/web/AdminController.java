package cn.szlee.xwh.web;

import cn.szlee.xwh.model.po.Admin;
import cn.szlee.xwh.service.AdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <b><code>AdminController</code></b>
 * <p/>
 * Description
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

    @GetMapping("/login")
    public List<Admin> login() {
        return service.list();
    }
}
