package com.mybatisgenerator;

import org.mybatis.generator.api.XmlFormatter;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.config.Context;

/**
 * @author: mengyongxu
 * @ClassName: MySelfXmlFormatter
 * @Time: 2021-02-05 16:16
 * @What:
 * @Tease:
 */
@Deprecated
public class MySelfXmlFormatter implements XmlFormatter {
    @Override
    public void setContext(Context context) {

//        context.generateFiles();
    }

    @Override
    public String getFormattedContent(Document document) {
        return null;
    }
}
