package cn.bdqn;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import java.util.Properties;

@SpringBootApplication(scanBasePackages="cn.bdqn")
@MapperScan(basePackages = {"cn.bdqn.mapper"})
@EnableTransactionManagement
//@EnableAutoConfiguration(exclude = { MultipartAutoConfiguration.class })
public class PropertyApplication {
    //创建了一个sprig容器【将Beasn纳入到spring管理中】
    //启动Tomcat服务器
    public static void main(String[] args) {
        SpringApplication.run(PropertyApplication.class,args);
    }

    //配置分页Bean
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties props = new Properties();
        props.setProperty("dialect","mysql");
        props.setProperty("supportMethodsArguments","true");
        pageHelper.setProperties(props);
        return pageHelper;
    }

    //配置文件上传
    // 显示声明CommonsMultipartResolver为mutipartResolver
    @Bean(name = "multipartResolver")
    public MultipartResolver multipartResolver() {
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setDefaultEncoding("UTF-8");
        resolver.setResolveLazily(true);// resolveLazily属性启用是为了推迟文件解析，以在在UploadAction中捕获文件大小异常
        resolver.setMaxInMemorySize(40960);
        resolver.setMaxUploadSize(5 * 1024 * 1024 * 1024);// 上传文件大小 5G
        return resolver;
    }
}
