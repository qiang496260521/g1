package com.qiangge.controller;

import com.qiangge.pojo.Label;
import com.qiangge.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/label")
public class LabelController {
    @Autowired
    LabelService labelService;

    @GetMapping
    public Result findAll(){
        List<Label> list = labelService.findAll();

        return new Result(true, StatusCode.OK,"查询成功",list);
    }
    @GetMapping(value = "/{id}")
    public Result findById(@PathVariable("id") String id){
        Label label = labelService.findById(id);
        return new Result(true, StatusCode.OK,"查询成功",label);
    }
    @PostMapping()
    public Result addLabel(@RequestBody Label label){
        labelService.addLabel(label);
        System.out.println(label);
        return new Result(true,StatusCode.OK,"保存成功");
    }
    @DeleteMapping(value ="/{id}" )
    public Result delLabel(@PathVariable("id") String id){
        labelService.delLabel(id);
        return new Result(true,StatusCode.OK,"更新成功");
    }
    @PutMapping(value="/{id}")
    public Result updateLabel(@PathVariable("id") String id,@RequestBody Label label){
        labelService.updateLabel(label);
        return new Result(true,StatusCode.OK,"删除成功");
    }
}
