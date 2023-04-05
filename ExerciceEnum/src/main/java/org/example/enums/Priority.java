package org.example.enums;

import java.security.PrivateKey;

public enum Priority {

    A(" A HIGH"),
    B(" B MEDIUM"),
    C( " C LOW "),
    D(" D LOW ");

    private String msg;
    private Priority(String m){
        this.msg = m;
    }

    public String getMsg(){
        return this.msg;
    }



}
