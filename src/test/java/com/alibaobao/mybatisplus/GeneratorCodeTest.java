package com.alibaobao.mybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableField;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: admin
 * @Description: 代码自动生成器
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.alibaobao.mybatisplus
 * @CreateTime: 2021-01-05 10:02:29
 */
public class GeneratorCodeTest {

    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator();

        // 全局配置
        GlobalConfig config = new GlobalConfig();
        config.setOutputDir(System.getProperty("user.dir")+"/src/main/java");
        config.setAuthor("artist");
        config.setFileOverride(false);
        config.setOpen(false);// 不打开资源管理器
        config.setServiceName("%sService");// 去掉Service的I前缀
        config.setIdType(IdType.ID_WORKER);
        config.setDateType(DateType.ONLY_DATE);
        config.setSwagger2(true);
        generator.setGlobalConfig(config);

        // 数据源配置
        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setDbType(DbType.MYSQL);
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/mybatis_plus?useSSL=true&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai");
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("yuguangbao");
        generator.setDataSource(dataSource);

        // 包名配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setModuleName("generator");
        packageConfig.setParent("com.alibaobao.mybatisplus");
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setMapper("mapper");
        packageConfig.setEntity("entity");
        generator.setPackageInfo(packageConfig);

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setInclude("user");// 设置需要映射的表名,可以配置多个（以逗号分隔）
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setLogicDeleteFieldName("deleted");
        TableFill fill1 = new TableFill("create_time", FieldFill.INSERT);
        TableFill fill2 = new TableFill("update_time", FieldFill.INSERT_UPDATE);
        List<TableFill> tableFills = Arrays.asList(fill1, fill2);
        strategyConfig.setTableFillList(tableFills);
        strategyConfig.setVersionFieldName("version");
        strategyConfig.setRestControllerStyle(true);
        strategyConfig.setControllerMappingHyphenStyle(true);

        generator.setStrategy(strategyConfig);

        generator.execute();

    }


}
