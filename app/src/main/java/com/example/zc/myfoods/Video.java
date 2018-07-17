package com.example.zc.myfoods;

import java.io.File;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;

public class Video extends BmobObject {
    private String mname;
    private BmobFile file;

    public Video(){
    }

    public Video(String name,BmobFile file){
        this.mname =name;
        this.file = file;
    }

    public String getName() {
        return mname;
    }

    public void setName(String name) {
        this.mname = name;
    }

    public BmobFile getFile() {
        return file;
    }

    public void setFile(BmobFile file) {
        this.file = file;
    }
}
