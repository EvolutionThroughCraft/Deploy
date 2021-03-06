/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.knowledge.repo;

import io.github.evolutionThroughCraft.knowledge.models.KnowledgeEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dwin
 */
public interface KnowledgeRepository extends JpaRepository<KnowledgeEntity, Long> {
    
    public List<KnowledgeEntity> findByAccountId(Long accountId);
}
