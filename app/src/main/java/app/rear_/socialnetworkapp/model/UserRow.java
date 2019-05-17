package app.rear_.socialnetworkapp.model;

import java.util.List;

public class UserRow {
    private String use_mail;
    private String use_pass;
    private String use_nick;
    private String use_sex;
    private Long use_date;

    private List<PostRow> postRowList;

    public String getUse_mail() {
        return use_mail;
    }

    public void setUse_mail(String use_mail) {
        this.use_mail = use_mail;
    }

    public String getUse_pass() {
        return use_pass;
    }

    public void setUse_pass(String use_pass) {
        this.use_pass = use_pass;
    }

    public String getUse_nick() {
        return use_nick;
    }

    public void setUse_nick(String use_nick) {
        this.use_nick = use_nick;
    }

    public String getUse_sex() {
        return use_sex;
    }

    public void setUse_sex(String use_sex) {
        this.use_sex = use_sex;
    }

    public Long getUse_date() {
        return use_date;
    }

    public void setUse_date(Long use_date) {
        this.use_date = use_date;
    }

    public List<PostRow> getPostRowList() {
        return postRowList;
    }

    public void setPostRowList(List<PostRow> postRowList) {
        this.postRowList = postRowList;
    }
}
