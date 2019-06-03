package cn.szlee.xwh.web;

import cn.szlee.xwh.model.po.Dept;
import cn.szlee.xwh.service.DeptService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * <b><code>DeptController</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/6/4 0:54.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.1.1-SNAPSHOT
 */
@RestController
@RequestMapping("/dept")
@Api(tags = "DeptController")
public class DeptController {

    @Autowired
    private DeptService service;

    @GetMapping("/list")
    public List<Dept> getList() {
        return service.list();
    }

    @GetMapping("/listAcceptable")
    public List<Dept> getAcceptableList() {
        return (List<Dept>) service.listByMap(Collections.singletonMap("acceptable", 1));
    }
}
