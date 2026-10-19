package org.a2o.interfaces.dto.rag.request;

import org.a2o.interfaces.dto.Page;

public class QueryRagMarketRequest extends Page {

    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}