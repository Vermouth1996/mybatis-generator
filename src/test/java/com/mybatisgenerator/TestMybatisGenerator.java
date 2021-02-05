package com.mybatisgenerator;

import org.assertj.core.util.DateUtil;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: mengyongxu
 * @ClassName: TestMybatisGenerator
 * @Time: 2021-01-19 10:33
 * @What:
 * @Tease:
 */
public class TestMybatisGenerator {

    public static void generator() throws Exception {

        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        //指定 逆向工程配置文件
        File configFile = new File("/Users/mengyongxu/IdeaProjects/mybatis-generator/src/main/resources/generator/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);

    }

    public static void main(String[] args) throws Exception {
//        try {
//            GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
//            generatorSqlmap.generator();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        TestMybatisGenerator testMybatisGenerator = new TestMybatisGenerator();
//
//        testMybatisGenerator.generator();

        generator();

    }


}
