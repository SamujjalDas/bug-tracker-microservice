package com.qualitycenter.bugtracker.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qualitycenter.bugtracker.model.Bug;
import com.qualitycenter.bugtracker.model.BugDto;
import com.qualitycenter.bugtracker.repository.BugRepository;

@Component
public class BugTrackingServiceImpl implements BugTrackingService {

	@Autowired
	private BugRepository bugRepository;

	@Override
	public Bug searchBug(long bugId) {
		Bug bugToRet = bugRepository.findById(bugId);
		return bugToRet;
	}

	@Override
	public Bug createBug(Bug bug) {
		bug.setCreationDate(LocalDateTime.now());
		bug.setModifiedDate(LocalDateTime.now());
		Bug bugToRet = bugRepository.save(bug);
		return bugToRet;
	}

	@Override
	public Bug updateBug(BugDto bugDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBug(BugDto bugDto) {
		bugRepository.deleteById(bugDto.getBug_id());
	}

	@Override
	public List<Bug> searchAllBug() {
		List<Bug> bugToRet = bugRepository.findAll();
		return bugToRet;
	}

}
