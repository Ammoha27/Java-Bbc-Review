package Vererbung.Teil1.Auftrag.geometryredundant;

public class TextRectangle extends Rectangle{

    String text;
    public TextRectangle(String text,Point topLeft, int width, int height){
        super(topLeft, width, height);
        this.position = topLeft;
        this.text = text;
        this.width = width;
        this.height = height;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
