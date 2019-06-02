package cn.szlee.xwh.service.impl;

import cn.szlee.xwh.mapper.AdminMapper;
import cn.szlee.xwh.model.po.Admin;
import cn.szlee.xwh.service.AdminService;
import cn.szlee.xwh.util.Md5SaltUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;

/**
 * <b><code>AdminServiceImpl</code></b>
 * <p/>
 * 管理员Service类实现
 * <p/>
 * <b>Creation Time:</b> 2019/6/2 14:52.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.0.1-SNAPSHOT
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Override
    public boolean login(Admin req) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", req.getUsername());
        Admin admin = baseMapper.selectOne(queryWrapper);
        boolean valid = admin != null && Md5SaltUtils.validPassword(req.getPassword(), admin.getPassword());
        if (valid) {
            admin.setLastLoginTime(new Date());
            baseMapper.updateById(admin);
        }
        return valid;
    }

    @Override
    public boolean checkIfUsernameExist(String username) {
        return baseMapper.selectByMap(Collections.singletonMap("username", username)) != null;
    }

    @Override
    public void add(Admin admin) {
        String encryptedPwd = Md5SaltUtils.getEncryptedPwd(admin.getPassword());
        admin.setPassword(encryptedPwd);
        admin.setCreateTime(new Date());
        baseMapper.insert(admin);
    }
}
