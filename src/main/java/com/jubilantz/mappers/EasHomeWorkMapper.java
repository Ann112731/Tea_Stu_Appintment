package com.jubilantz.mappers;

import com.jubilantz.entity.EasHomeWork;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EasHomeWorkMapper{
    @Insert("INSERT INTO homework (id, stuid, teaid, workpath, workscore, workname) " +
            "VALUES (#{id}, #{stuid}, #{teaid}, #{workpath}, #{workscore}, #{workname})")
    void insertEasHomeWork(EasHomeWork easHomeWork);

    @Update("UPDATE homework SET stuid = #{stuid}, teaid = #{teaid}, " +
            "workpath = #{workpath}, workscore = #{workscore}, workname = #{workname} " +
            "WHERE id = #{id}")
    void updateEasHomeWork(EasHomeWork easHomeWork);

    @Delete("DELETE FROM homework WHERE id = #{id}")
    void deleteEasHomeWork(int id);

    @Select("SELECT * FROM homework WHERE id = #{id}")
    EasHomeWork getEasHomeWorkById(int id);

    @Select("SELECT * FROM homework")
    List<EasHomeWork> getAllEasHomeWork();


    @Select("SELECT * FROM homework WHERE stuid = #{stuid}")
    List<EasHomeWork> getEasHomeWorkByStyId(int stuid);

    @Select("SELECT * FROM homework WHERE teaid = #{teaid}")
    List<EasHomeWork> getEasHomeWorkByTeaId(int teaid);


}