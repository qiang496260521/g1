package com.qiangge.service;

import com.qiangge.dao.LabelDao;
import com.qiangge.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.IdWorker;

import java.util.List;

@Service
@Transactional
public class LabelService {

    @Autowired
    LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;

    public List<Label> findAll(){
        return  labelDao.findAll();
    }
    public Label findById(String id){
        return  labelDao.findById(id).get();
    }
    public void delLabel(String id){
         labelDao.deleteById(id);
    }
    public void addLabel(Label label){
        String id = idWorker.nextId()+"";
        label.setId(id);
        labelDao.save(label);
    }
    public void updateLabel(Label label){
     labelDao.save(label);
    }

}
