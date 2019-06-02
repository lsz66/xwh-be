package cn.szlee.xwh.service.impl;

import cn.szlee.xwh.mapper.AdminMapper;
import cn.szlee.xwh.model.po.Admin;
import cn.szlee.xwh.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <b><code>AdminServiceImpl</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/6/2 14:52.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.0.1-SNAPSHOT
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
}
