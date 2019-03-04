package app.RecyclerViewSkill.com.recyclerviewskill.model;

public class Message {
    private int id;
    private String from;
    private String subject;
    private String timestamp;
    private String time;
    private String message;
    private String icon;
    private String picture;
    private boolean isSponsored;
    private boolean isImportant;
    private boolean isStarClicked;
    private boolean isRead;
    private int color = -1;



    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }



    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



    public boolean isSponsored() {
        return isSponsored;
    }

    public void setSponsored(boolean sponsored) {
        isSponsored = sponsored;
    }

    public boolean isStarClicked(){
        return isStarClicked;
    }


    public void setStarClicked(boolean starClicked){
        isStarClicked = starClicked;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
