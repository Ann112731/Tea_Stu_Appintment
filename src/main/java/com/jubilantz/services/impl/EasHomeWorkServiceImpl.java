package com.jubilantz.services.impl;

import com.jubilantz.entity.EasHomeWork;
import com.jubilantz.mappers.EasHomeWorkMapper;
import com.jubilantz.services.EasHomeWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EasHomeWorkServiceImpl implements EasHomeWorkService {


    @Autowired
    private EasHomeWorkMapper easHomeWorkMapper;

    @Override
    public List<EasHomeWork> getAllEasHomeWork() {
        return easHomeWorkMapper.getAllEasHomeWork();
    }

    @Override
    public List<EasHomeWork> getEasHomeWorkByStuId(int stuid) {
        return easHomeWorkMapper.getEasHomeWorkByStyId(stuid);
    }

    @Override
    public List<EasHomeWork> getEasHomeWorkByTeaId(int teaid) {
        return easHomeWorkMapper.getEasHomeWorkByTeaId(teaid);
    }

    @Override
    public void insertEasHomeWork(EasHomeWork easHomeWork) {
        easHomeWorkMapper.insertEasHomeWork(easHomeWork);
    }

    @Override
    public void updateEasHomeWork(EasHomeWork easHomeWork) {
        easHomeWorkMapper.updateEasHomeWork(easHomeWork);
    }

    @Override
    public void deleteEasHomeWork(int id) {
        easHomeWorkMapper.deleteEasHomeWork(id);
    }

    @Override
    public EasHomeWork getEasHomeWorkById(int id) {
        return easHomeWorkMapper.getEasHomeWorkById(id);
    }
}