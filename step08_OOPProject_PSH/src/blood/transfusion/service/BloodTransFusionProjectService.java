package blood.transfusion.service;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.Donor;
import blood.transfusion.dto.People;
import blood.transfusion.dto.Recipient;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.exception.NotSupportedTypeException;
import blood.transfusion.model.BloodTransfusionVirtualDB;

public class BloodTransFusionProjectService {
	private static BloodTransFusionProjectService instance = new BloodTransFusionProjectService();
	private BloodTransfusionVirtualDB projectVirtualData = BloodTransfusionVirtualDB.getInstance();

	private BloodTransFusionProjectService(){}
	public static BloodTransFusionProjectService getInstance(){
		return instance;
	}
	
	// 모든 프로젝트 반환
	public ArrayList<BloodTransfusionProject> getAllProjects(){
		return projectVirtualData.getProjectList();
	}
	
	// 프로젝트 검색_
	public BloodTransfusionProject getProject(String projectName) throws NotExistException {
		BloodTransfusionProject project = null;
		
		for (BloodTransfusionProject proj : getAllProjects()) {
			if (proj.getBtProjectName().equals(projectName)) {
				project = proj;
			}
		}
		
		if(project == null) {
			throw new NotExistException(projectName+" 은 존재하지 않는 프로젝트 명입니다.");
		}
		return project;
	}

	// 새로운 프로젝트 추가
	public void projectInsert(BloodTransfusionProject project) {
		projectVirtualData.insertProject(project);
	}
	
	// 프로젝트 수정 - 프로젝트 명으로 현혈자 혹은 수혈자 수정_
	public void projectUpdate(String projectName, People people) throws NotExistException, NotSupportedTypeException{
		BloodTransfusionProject project = getProject(projectName);
		if(people instanceof Recipient) {
			project.setRecipient((Recipient) people);
		} else if(people instanceof Donor) {
			project.setDonor((Donor) people);
		} else {
			throw new NotSupportedTypeException("올바르지 않은 수정 형식입니다. 입력하신 데이터의 형태를 확인해주세요");
		}
	}
	
	
	// 프로젝트 삭제_
	public void projectDelete(String projectName) throws NotExistException{
		BloodTransfusionProject project = getProject(projectName);
		projectVirtualData.removeProject(project);
	}
}
