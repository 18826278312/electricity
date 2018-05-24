package com.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.dto.ElectricityDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zheng on 2018/5/8.
 */
public class Test {
    public static void main(String[] args){
        String a = "[{\"alarm\":true,\"amount\":685,\"month\":\"201710\"},{\"alarm\":true,\"amount\":685,\"month\":\"201711\"},{\"alarm\":true,\"amount\":686,\"month\":\"201712\"},{\"alarm\":true,\"amount\":695,\"month\":\"201801\"},{\"alarm\":true,\"amount\":695,\"month\":\"201802\"}]";
        List<ElectricityDto> list = JSONArray.parseArray(a,ElectricityDto.class);
        for (ElectricityDto e : list) {
            System.out.println(JSON.toJSON(e));
        }
    }

}
