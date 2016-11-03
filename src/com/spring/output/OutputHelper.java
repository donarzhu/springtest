package com.spring.output;

import com.spring.output.impl.CsvOutputGenerator;

/**
 * Created by donar on 2016/11/3.
 */
public class OutputHelper {
    IOutputGenerator outputGenerator;

    public void generateOutput(){
        outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }

}
