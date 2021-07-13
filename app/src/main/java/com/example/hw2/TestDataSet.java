package com.example.hw2;

import java.util.ArrayList;
import java.util.List;

public class TestDataSet {

    public static List<TestData> getData() {
        List<TestData> result = new ArrayList();
        result.add(new TestData("北京申奥成功", "524.6w"));
        result.add(new TestData("中岛美嘉 毛不易", "433.6w"));
        result.add(new TestData("光遇复刻", "357.8w"));
        result.add(new TestData("实拍空间站凌日", "333.6w"));
        result.add(new TestData("73℃高温烤化汽车", "285.6w"));
        result.add(new TestData("24年前张桂梅倒在讲台上", "183.2w"));
        result.add(new TestData("精灵幻想记", "139.4w"));
        result.add(new TestData("刘德华祝福失孤原型", "75.6w"));
        result.add(new TestData("爆笑吐槽云顶天宫", "55w"));
        result.add(new TestData("BLG TT", "43w"));
        result.add(new TestData("多地降雨量突破历史值", "22.2w"));
        return result;
    }

}