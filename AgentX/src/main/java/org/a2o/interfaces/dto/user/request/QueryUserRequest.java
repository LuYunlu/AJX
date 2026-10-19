package org.a2o.interfaces.dto.user.request;

import org.a2o.interfaces.dto.Page;

public class QueryUserRequest extends Page {

    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}