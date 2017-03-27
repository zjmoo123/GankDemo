package com.example.zjm.gankdemo.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/3/25.
 */

public class OneDayContent {
    private boolean error;
    private List<Result> results;

    public OneDayContent() {
    }

    public OneDayContent(boolean error, List<Result> results) {
        this.error = error;
        this.results = results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean isError() {

        return error;
    }

    public List<Result> getResults() {
        return results;
    }
}
