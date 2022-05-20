
package model;


/**
 * BookOnTape is the model class extends from Thing class
 * @author HungDao
 * @version 1.0
 */
public class BookOnTape  extends Thing{
    private String title;
    private String author;
    private String type;
    private String accent;

    
    public BookOnTape() {
    }

    public BookOnTape(String title, String author, String type, String accent) {
        super();
        this.title = title;
        this.author = author;
        this.type = type;
        this.accent = accent;
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

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccent() {
        return accent;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }

      @Override
    public String getDescription(){
        return 
                "Serial number: " + super.getSerialNumber() +"\n" +
              "Title: "+ this.title + "\n"
              +"Author: " + this.author + "\n"
              +"Type: " + this.type + "\n"
              +"Accent: " + this.accent +"\n"
              ;
    }
}
