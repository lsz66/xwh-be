package cn.szlee.xwh;

import cn.szlee.xwh.model.po.Position;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <b><code>Application</code></b>
 * <p/>
 * Spring Boot启动类
 * <p/>
 * <b>Creation Time:</b> 2019/6/2 14:25.
 *
 * @author Li Shangzhe
 * @since xwh-be 0.0.1-SNAPSHOT
 */
@SpringBootApplication
@MapperScan("cn.szlee.xwh.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Position position;
    }
}
