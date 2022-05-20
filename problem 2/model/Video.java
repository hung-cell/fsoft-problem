
package model;


/**
 * Video is the model class extends from Thing class
 * @author HungDao
 * @version 1.0
 */
public class Video extends Thing{
    
    private String title;
    private String author;

    private String content;
    private String topic;
    public Video(String title, String author, String content,String topic) {
        super();
        this.title = title;
        this.author = author;
      
        this.content = content;
        this.topic = topic;
    }

    public Video() {
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setContent(String content) {
        this.content = author;
    }
    public String setContent() {
        return content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getDescription(){
        return 
               "Serial number: " + super.getSerialNumber() +"\n" +
              "Author: "+ this.author + "\n"
              +"Title: " + this.title + "\n"
              +"Content: " + this.content +"\n"
              ;
    }
}
