package com.spring.output.impl;

import com.spring.output.IOutputGenerator;

/**
 * Created by donar on 2016/11/3.
 */
public class CsvOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("Csv Output Generator");
    }
}
