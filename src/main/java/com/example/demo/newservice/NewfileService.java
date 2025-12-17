package com.example.demo.newservice;

import com.example.demo.newentity.NewfileEntity;

public interface Newfileservice {

    NewfileEntity savedata(NewfileEntity newfile);

    NewfileEntity getidval(Long id);
}
