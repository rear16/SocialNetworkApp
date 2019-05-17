package app.rear_.socialnetworkapp.model;

public class PostRow {
    private UserRow user;
    private Long pos_date;
    private String pos_title;
    private String pos_content;

    public UserRow getUser() {
        return user;
    }

    public void setUser(UserRow user) {
        this.user = user;
    }

    public String getUse_mail() {
        return user != null? user.getUse_mail():null;
    }

    public void setUse_mail(String use_mail) {
        if(user == null)
            user = new UserRow();
        user.setUse_mail(use_mail);
    }

    public Long getPos_date() {
        return pos_date;
    }

    public void setPos_date(Long pos_date) {
        this.pos_date = pos_date;
    }

    public String getPos_title() {
        return pos_title;
    }

    public void setPos_title(String pos_title) {
        this.pos_title = pos_title;
    }

    public String getPos_content() {
        return pos_content;
    }

    public void setPos_content(String pos_content) {
        this.pos_content = pos_content;
    }
}
