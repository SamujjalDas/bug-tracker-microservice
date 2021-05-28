package com.qualitycenter.bugtracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qualitycenter.bugtracker.model.Bug;
import com.qualitycenter.bugtracker.model.BugDto;

@Service
public interface BugTrackingService {
	public Bug searchBug(long bugId);

	public Bug createBug(Bug bug);

	public Bug updateBug(BugDto bugDto);

	public void deleteBug(BugDto bugDto);

	public List<Bug> searchAllBug();

}
