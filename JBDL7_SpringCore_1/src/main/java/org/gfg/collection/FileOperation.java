package org.gfg.collection;

public class FileOperation {

    String textContent;

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public void initMethod(){
        System.out.println("This is the init method, going to open the file");
    }

    public void destroyMethod(){
        System.out.println("Going to close the opened file");
    }

    @Override
    public String toString() {
        return "FileOperation{" +
                "textContent='" + textContent + '\'' +
                '}';
    }
}
