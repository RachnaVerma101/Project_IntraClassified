package adminPackage;

import java.util.Date;

public class Classifieds {
    int Classified_id, Price;
    String Title;
    String Description;
    String Category;
    String Publisher;
    String Status;

    public String getModifier() {
        return Modifier;
    }

    public void setModifier(String modifier) {
        Modifier = modifier;
    }

    public Date getDate_Modified() {
        return Date_Modified;
    }

    public void setDate_Modified(Date date_Modified) {
        Date_Modified = date_Modified;
    }

    String Modifier;
    Date Date_Published, Date_Modified;

    public int getClassified_id() {
        return Classified_id;
    }

    public void setClassified_id(int classified_id) {
        Classified_id = classified_id;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getDate_Published() {
        return Date_Published;
    }

    public void setDate_Published(Date date_Published) {
        Date_Published = date_Published;
    }

    @Override
    public String toString() {
        String s = this.Classified_id + " " + this.Title + " " + this.Price + " " + this.Description +
                this.Category + " " + this.Date_Published + " "  + this.Publisher + " " + this.Status;
        return s;
    }
}