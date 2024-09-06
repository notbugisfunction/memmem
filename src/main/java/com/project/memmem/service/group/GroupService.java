package com.project.memmem.service.group;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.project.memmem.domain.dto.group.GroupListDTO;
import com.project.memmem.domain.dto.group.GroupSaveDTO;
import com.project.memmem.domain.dto.group.GroupUpdateDTO;
import com.project.memmem.domain.entity.Category;
import com.project.memmem.domain.entity.GroupEntity;

public interface GroupService {

	void groupSaveProcess(long userId, GroupSaveDTO dto);

	Map<String, String> s3TempUpload(MultipartFile file) throws IOException;

	List<GroupListDTO> getGroupsByGroupId(Long groupId);

	void joinGroup(long userId, Long groupId);

	boolean isUserMemberOfGroup(long userId, Long groupId);

	boolean isUserCreatorOfGroup(long userId, Long groupId);

	GroupEntity findGroupById(Long groupId);

	GroupUpdateDTO getGroupUpdateDTOById(Long id);

	void updateProcess(Long id, GroupUpdateDTO dto, MultipartFile groupImage);

	void deleteGroup(Long id);

	Map<String, String> getInitialsForUserAndCreator(Long groupId, long userId);

	void leaveGroup(long userId, Long groupId);



}
