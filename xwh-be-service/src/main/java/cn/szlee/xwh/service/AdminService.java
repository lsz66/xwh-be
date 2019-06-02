package cn.szlee.xwh.service;

import cn.szlee.xwh.model.po.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <b><code>AdminService</code></b>
 * <p/>
 * 管理员Service类
 * <p/>
 * <b>Creation Time:</b> 2019/6/2 14:52.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.0.1-SNAPSHOT
 */
public interface AdminService extends IService<Admin> {

    /**
     * 管理员登录
     *
     * @param admin 管理员实体类
     * @return 若密码正确则返回true
     */
    boolean login(Admin admin);

    /**
     * 检查用户名是否已被使用
     *
     * @param username 用户名
     * @return 若已被使用，则返回true
     */
    boolean checkIfUsernameExist(String username);

    /**
     * 添加管理员
     *
     * @param admin 管理员实体类
     */
    void add(Admin admin);
}
