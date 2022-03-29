package site.lgzzk.dto;

public class BorrowOrderDto {
    private String barcode;
    private String bookName;
    private String typeName;
    private String caseName;
    private String pubName;
    private String author;
    private Float price;
    private Integer count;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "BorrowOrderDto{" +
                "barcode='" + barcode + '\'' +
                ", bookName='" + bookName + '\'' +
                ", typeName='" + typeName + '\'' +
                ", caseName='" + caseName + '\'' +
                ", pubName='" + pubName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
