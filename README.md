# SpringBoot从零学习笔记！[参考视频](http://www.imooc.com/learn/767)

1. 工程启动
- 第一种启动方式：ide中启动
- 第二种启动方式：进入项目根目录，命令行输入 mvn spring-boot:run
- 第三种启动方式：进入项目根目录，命令行输入 mvn install（编译项目，会产生一个jar包）
然后进入target文件，命令行输入 java -jar learnservice-0.0.1-SNAPSHOT.jar（jar包名）

2. [修改banner](http://patorjk.com/software/taag)

3. 项目属性配置
- @Value
- @Component
- @ConfigurationProperties

4. Controller的使用

注解 | 解释
---|---
@Controller | 处理http请求
@RestController | Spring4后的新注解，原来返回json需要@ResponseBody配合@Controller
@RequestMapping | 配置url映射
@PathVariable | 获取url中的数据
@RequestParam | 获取请求参数的值
@GetMapping | 组合注解

