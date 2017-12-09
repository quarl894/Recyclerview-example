package youngjung.recyclerview_sample;

/**
 * Created by HANSUNG on 2017-12-09.
 */

public class Mydata {
    int Imageuri;
    String title;
    String content;

    public Mydata(int imageuri, String title, String content) {
        Imageuri = imageuri;
        this.title = title;
        this.content = content;
    }

    public int getImageuri() {
        return Imageuri;
    }

    public void setImageuri(int imageuri) {
        Imageuri = imageuri;
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
}
