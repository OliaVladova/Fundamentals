package SoftUni.Fundamentals.ObjectsAndClassesExercise.Articles;

public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

  /*  public String getTitle() {
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }*/

    public String editContent(String content) {
        this.content = content;
        return this.content;
    }

    public String changeAuthor(String newAuthor) {
        this.author = newAuthor;
        return this.author;
    }

    public String rename(String newTitle) {
        this.title= newTitle;
        return this.title;
    }

    //"{title} - {content}:{author}"
    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}

