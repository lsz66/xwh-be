package cn.szlee.xwh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <b><code>SwaggerConfig</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/6/2 13:46.
 *
 * @author Li Shangzhe
 * @since xwh 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * Create restful api doc docket.
     *
     * @return the docket
     */
    @Bean
    public Docket createRestfulApiDoc() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .tags(
                        new Tag("ActivityController", "用户API"),
                        new Tag("ApplyController", "事项类型API")
                )
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.szlee.xwh.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * Api info api info.
     *
     * @return the api info
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("宣委会后端Restful API")
                .contact(new Contact("李尚哲", "https://szlee.cn", "lsz@szlee.cn"))
                .version("0.1.0-SNAPSHOT")
                .build();
    }
}

