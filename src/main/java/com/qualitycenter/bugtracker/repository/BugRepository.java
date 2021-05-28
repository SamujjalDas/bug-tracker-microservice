package com.qualitycenter.bugtracker.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qualitycenter.bugtracker.model.Bug;

@Repository
public interface BugRepository extends JpaRepository<Bug, Long> {
	@Transactional
	public Bug findById(long bugId);
}
