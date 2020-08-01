package com.pack.configration;

import org.springframework.core.type.classreading.*;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author Neo
 * @date 2020/3/11 21:52
 */
public class TestTypeFilter implements TypeFilter {
    public TestTypeFilter() {
    }

    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
            throws IOException {
        String classname = metadataReader.getClassMetadata().getClassName();
        System.out.println("------>" + classname);
        if(classname.contains("contro"))
            return true;
        return false;
    }
}
