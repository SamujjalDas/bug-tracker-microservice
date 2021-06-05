package com.qualitycenter.bugtracker.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qualitycenter.bugtracker.model.Bug;
import com.qualitycenter.bugtracker.model.BugDto;
import com.qualitycenter.bugtracker.model.BugErrorResponseDto;
import com.qualitycenter.bugtracker.model.BugResponseDto;
import com.qualitycenter.bugtracker.service.BugTrackingService;

@RestController
public class BugTrackerController {

	@Autowired
	private BugTrackingService bugTrackingService;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/createBug")
	public ResponseEntity<?> createBug(@RequestBody Bug bug) {
		Bug bugToRet = bugTrackingService.createBug(bug);
		if (bugToRet != null) {
			BugResponseDto bugResponseDto = new BugResponseDto();
			bugResponseDto.setBug_id(bugToRet.getBug_id());
			bugResponseDto.setMessage("Bug logged successfully in system");
			return new ResponseEntity<BugResponseDto>(bugResponseDto, HttpStatus.OK);
		}

		BugErrorResponseDto bugErrorResponseDto = new BugErrorResponseDto();
		bugErrorResponseDto.setStatus("404");
		bugErrorResponseDto.setError("There was and error processing your request. please try again");
		return new ResponseEntity<BugErrorResponseDto>(bugErrorResponseDto, HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@DeleteMapping("/deleteBug")
	public ResponseEntity<?> deleteBug(@RequestBody BugDto bugDto) {
		Bug bugToRet = bugTrackingService.searchBug(bugDto.getBug_id());
		if (bugToRet != null) {
			bugTrackingService.deleteBug(bugDto);
			BugResponseDto bugResponseDto = new BugResponseDto();
			bugResponseDto.setBug_id(bugDto.getBug_id());
			bugResponseDto.setMessage("Bug deleted from system");
			return new ResponseEntity<BugResponseDto>(bugResponseDto, HttpStatus.OK);
		}
		BugErrorResponseDto bugErrorResponseDto = new BugErrorResponseDto();
		bugErrorResponseDto.setStatus("404");
		bugErrorResponseDto.setError("Bug with provided id does not exist. please try again");
		return new ResponseEntity<BugErrorResponseDto>(bugErrorResponseDto, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/search/{bugId}")
	public ResponseEntity<?> searchBug(@PathVariable long bugId, HttpServletResponse response) {
		Bug bugToRet = bugTrackingService.searchBug(bugId);

		if (bugToRet != null) {
			return new ResponseEntity<Bug>(bugToRet, HttpStatus.OK);
		}
		BugErrorResponseDto bugErrorResponseDto = new BugErrorResponseDto();
		bugErrorResponseDto.setStatus("404");
		bugErrorResponseDto.setError("Bug with provided id does not exist. please try again");
		return new ResponseEntity<BugErrorResponseDto>(bugErrorResponseDto, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/searchAll")
	public ResponseEntity<?> searchAllBug(HttpServletResponse response) {
		List<Bug> bugToRet = bugTrackingService.searchAllBug();

		if (bugToRet != null) {
			return new ResponseEntity<Bug>((Bug) bugToRet, HttpStatus.OK); //Fix this
		}
		BugErrorResponseDto bugErrorResponseDto = new BugErrorResponseDto();
		bugErrorResponseDto.setStatus("404");
		bugErrorResponseDto.setError("Bug with provided id does not exist. please try again");
		return new ResponseEntity<BugErrorResponseDto>(bugErrorResponseDto, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/loginApp")
	public String login() {
		return "authenticated successfully";
	}
	
	

}
