package com.example.batch.passbatch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// BaseEntity.class 에서 설정된 것을 적용해주도록 하는 어노테이션
@EnableJpaAuditing // jpa 엔티티의 필드를 자동으로 넣어주는 등 감시해고 관리 해주는 기능(예: 시간)
@Configuration
public class JpaConfig {
}
