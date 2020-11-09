package com.uqidev.taskdesk.repository;

import com.uqidev.taskdesk.dto.TeamDto;
import com.uqidev.taskdesk.dto.TeamInterface;
import com.uqidev.taskdesk.dto.TeamTeamMemberDto;
import com.uqidev.taskdesk.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
    //    @Query(value = "select * from team", nativeQuery = true)
//    TeamTeamMemberDto findByName(String teamName);
//    List<TeamTeamMemberDto> findAllBy();



    /*
     * @Query("SELECT new
     * com.thorben.janssen.spring.jpa.projections.dto.AuthorSummaryDTO(a.firstName, a.lastName)
     * FROM Author a WHERE a.firstName = :firstName")
     * */
    /// ****  Interface Based Projection *******
//    List<TeamInterface> findBy();
    //todo: Working well
//    @Query(value = "select t.id,t.name from team t",nativeQuery = true)
//    @Query(value = "select t.id,t.name,o.* from team t inner join organization o on o.id = t.organization_id",nativeQuery = true)
    List<TeamInterface> findTeamsBy();

    // Class Based Projection
    @Query("SELECT new com.uqidev.taskdesk.dto.TeamDto(t.id,t.name) FROM Team t")
//    @Query("SELECT t.id,t.name from Team t")
//    @Query("SELECT new com.uqidev.taskdesk.dto.TeamDto(t.id,t.name,t.organization) FROM Team t ")
    List<TeamDto> findAllBy();
}
