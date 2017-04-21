package io.github.dearzack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnServiceApplication.class, args);
		//第一种启动方式：ide中启动
		//第二种启动方式：进入项目根目录，命令行输入 mvn spring-boot:run
		//第三种启动方式：进入项目根目录，命令行输入 mvn install（编译项目，会产生一个jar包）
		//然后进入target文件，命令行输入 java -jar learnservice-0.0.1-SNAPSHOT.jar（jar包名）
		//修改banner：http://patorjk.com/software/taag


	}
}
