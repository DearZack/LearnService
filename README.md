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

5.数据库操作

jpa配置
- create每次运行时都会创建一个新的表，如果之前存在这个表会先删除之前的旧表重新创建
- upadte会保留之前的
- create-drop应用停止时就会删除
- none什么都不做
- validate什么都不做，但是会验证bean和原来的表结构是否一致，不一致报错

6.数据库事务
- @Transactional


---
# [进阶](http://www.imooc.com/learn/810)
1. 表单验证
- @Valid对需要验证的字段加上
- BindingResult 验证结果会放在这个类中
2. AOP

3. 统一异常处理

4. 单元测试