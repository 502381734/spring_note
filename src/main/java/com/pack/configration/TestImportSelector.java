package com.pack.configration;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Neo
 * @date 2020/3/11 22:55
 */
public class TestImportSelector implements ImportSelector {
    public TestImportSelector() {
    }

    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.pack.bean.TestImport"};
    }
}
