package com.example.zjm.gankdemo.bean;

/**
 * Created by Administrator on 2017/3/25.
 */

public class Result {
    private String _id;
    private String content;
    private String created_at;
    private String publishedAt;
    private String rand_id;
    private String title;
    private String updated_at;

    public Result() {
    }

    public Result(String _id, String content, String created_at, String publishedAt, String rand_id, String title, String updated_at) {
        this._id = _id;
        this.content = content;
        this.created_at = created_at;
        this.publishedAt = publishedAt;
        this.rand_id = rand_id;
        this.title = title;
        this.updated_at = updated_at;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public void setRand_id(String rand_id) {
        this.rand_id = rand_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String get_id() {

        return _id;
    }

    public String getContent() {
        return content;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getRand_id() {
        return rand_id;
    }

    public String getTitle() {
        return title;
    }

    public String getUpdated_at() {
        return updated_at;
    }
}
