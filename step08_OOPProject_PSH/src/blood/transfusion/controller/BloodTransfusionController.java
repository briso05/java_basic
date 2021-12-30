package blood.transfusion.controller;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.People;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.exception.NotSupportedTypeException;
import blood.transfusion.service.BloodTransFusionProjectService;
import blood.transfusion.view.EndView;
import blood.transfusion.view.FailView;

public class BloodTransfusionController {
	private static BloodTransfusionController instance = new BloodTransfusionController();
	private BloodTransFusionProjectService service = BloodTransFusionProjectService.getInstance();

	private BloodTransfusionController() {
	}

	public static BloodTransfusionController getInstance() {
		return instance;
	}

	// 모든 프로젝트 검색
	public void projectListView() {
		ArrayList<BloodTransfusionProject> projectList = service.getAllProjects();
		EndView.projectListView(projectList);
	}
	
	// 특정 프로젝트 검색_
	public void projectView(String projectName) {
		BloodTransfusionProject project;
		try {
			project = service.getProject(projectName);
			EndView.projectView(project);
		} catch (NotExistException e) {
//			e.printStackTrace();
			FailView.failMessageView(e.getMessage());
		} catch (Exception e) {
			FailView.failMessageView(e.getMessage());
		}
		
		
		
	}

	// 새로운 프로젝트 저장
	public void insertProject(BloodTransfusionProject newProject) {
		service.projectInsert(newProject);
		EndView.messageView("프로젝트 " + newProject.getBtProjectName() +"이(가) 정상적으로 저장되었습니다.");
	}
	
	// 존재하는 프로젝트 수정_
	public void updateProject(String projectName, People people) {
		try {
			service.projectUpdate(projectName, people);
			EndView.messageView("프로젝트명 "+projectName+" 이(가) 정상적으로 수정되었습니다.");
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			FailView.failMessageView("수정에 실패했습니다.");
		} catch (NotSupportedTypeException e) {
			FailView.failMessageView(e.getMessage());
			FailView.failMessageView("수정에 실패했습니다.");
		} catch (Exception e) {
			FailView.failMessageView(e.getMessage());
		}
		
	}

	// 특정 프로젝트 삭제_
	public void deleteProject(String projectName) {
		try {
			service.projectDelete(projectName);
			EndView.messageView("프로젝트명 "+projectName+" 이(가) 정상적으로 삭제되었습니다.");
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			FailView.failMessageView("삭제에 실패했습니다.");
		} catch (Exception e) {
			FailView.failMessageView(e.getMessage());
		}
	}
}




























