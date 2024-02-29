package Thursday_LAB_22_02_2024;


class Book 
{
    private String title;
    private String author;
    private float price;

    public Book(String title, String author, float price) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) 
    {
        this.price = price;
    }

    @Override
    public String toString() 
    {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price='₹" + price + '\'' + // Price in INR
                '}';
    }
}
