package com.cydeo.solid.dependencyInversion.good;

public class XLMReader implements Reader{

    @Override
    public String getUserName() {
        return "<username>mikesmith</username>";
    }
}
