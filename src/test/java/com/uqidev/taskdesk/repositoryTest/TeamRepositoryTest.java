package com.uqidev.taskdesk.repositoryTest;

import com.uqidev.taskdesk.dto.TeamDto;
import com.uqidev.taskdesk.dto.TeamInterface;
import com.uqidev.taskdesk.model.Team;
import com.uqidev.taskdesk.repository.TeamRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Slf4j
public class TeamRepositoryTest {
    @Autowired
    private TeamRepository teamRepository;

    @Test
    @Transactional
    public void testFindAll(){
      List<Team> teams = teamRepository.findAll();
      log.info("teams:{}",teams);
    }

//    @Test
//    public void testFindAllTeamTeamMemberDto(){
////        String teamName = "org-1-team-1";
////        TeamTeamMemberDto teamTeamMemberDto = teamRepository.findByName(teamName);
//        List<TeamTeamMemberDto> teamTeamMemberDto = teamRepository.findAllBy();
//        log.info("teamTeamMemberDtos:{}",teamTeamMemberDto);
//    }

    @Test
    @Transactional
    public void testTeamInterfaceProjection(){
        List<TeamInterface> teamInterfaces = teamRepository.findTeamsBy();
        log.info("teamInterfaces:{}",teamInterfaces);
    }

    @Test
    public void testFindAllTeamDtos(){
        List<TeamDto> teamDtos = teamRepository.findAllBy();
        log.info("teamDtos:{}",teamDtos);
    }

    @Test
    public void testFindAllTeam(){
        List<Team> teams = teamRepository.findAll();
        log.info("teams:{}",teams);
    }
}
