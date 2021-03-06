package com.bodastage.cm.networkaudit.repositories.jpa;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.bodastage.cm.networkaudit.models.AuditRuleEntity;

public interface AuditRuleRepository extends CrudRepository<AuditRuleEntity, Long> {
	Collection<AuditRuleEntity> findAll();
	AuditRuleEntity findByPk(Long Pk);
	Collection<AuditRuleEntity> findByCategoryPk(Long categoryPk);
	Collection<AuditRuleEntity> findByNameContainingIgnoreCase(String name);
	Collection<AuditRuleEntity> findByCategoryPkAndNameContainingIgnoreCase(Long categoryPk, String name);
}	