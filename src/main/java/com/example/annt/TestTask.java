package com.example.annt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 洁祎
 */
@Component
@Slf4j
public class TestTask  implements listener{

       @Autowired
       private AnnotationConfig annotationConfig;

        @Override
        public void receiver(AnnotationParam param) {
            if (Objects.isNull(param.getBizType())){
                log.warn("传参不能为空");
                throw new RuntimeException("传参不能为空");
            }
            AnnotationService<AnnotationParam> archiveService = annotationConfig.getArchiveService(param.getBizType());

            if (archiveService != null) {
                // 根据type选择对应服务处理
                archiveService.process(param);
            }
        }
}
