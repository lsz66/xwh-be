package cn.szlee.xwh.service.impl;

import cn.szlee.xwh.mapper.DeptMapper;
import cn.szlee.xwh.model.po.Dept;
import cn.szlee.xwh.service.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <b><code>DeptServiceImpl</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/6/4 0:54.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.1.1-SNAPSHOT
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {
}
