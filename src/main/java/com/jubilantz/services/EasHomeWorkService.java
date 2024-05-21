package com.jubilantz.services;

import com.jubilantz.entity.EasHomeWork;

import java.util.List;

public interface EasHomeWorkService {
    void insertEasHomeWork(EasHomeWork easHomeWork);
    void updateEasHomeWork(EasHomeWork easHomeWork);
    void deleteEasHomeWork(int id);
    EasHomeWork getEasHomeWorkById(int id);

    List<EasHomeWork> getAllEasHomeWork();

    List<EasHomeWork> getEasHomeWorkByStuId(int stuid);

    List<EasHomeWork> getEasHomeWorkByTeaId(int teaid);
}