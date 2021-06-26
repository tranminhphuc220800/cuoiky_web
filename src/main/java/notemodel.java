public class notemodel {
    private int idnote;
    private String iduser;
    private String title;

    public int getIdnote() {
        return idnote;
    }

    public void setIdnote(int idnote) {
        this.idnote = idnote;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
}
