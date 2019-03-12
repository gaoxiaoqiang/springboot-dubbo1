package tst.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//排除掉数据源
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ImportResource(value = {"classpath:applicationContext-dubbo.xml"})
public class ConSumerApplication {

		public static void main(String[] args) {
			SpringApplication.run(ConSumerApplication.class, args);
		}
}
