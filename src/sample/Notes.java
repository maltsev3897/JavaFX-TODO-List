package sample;

import java.io.Serializable;
import java.util.Arrays;

public class Notes implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] labelN;
    private String[] textN;
    private String[] dateN;

    public Notes(String[] labelN, String[] textN, String[] dateN) {
        this.labelN = labelN;
        this.textN = textN;
        this.dateN = dateN;
    }

    public String[] getLabelN() {
        return labelN;
    }

    public void setLabelN(String[] labelN) {
        this.labelN = labelN;
    }

    public String[] getTextN() {
        return textN;
    }

    public void setTextN(String[] textN) {
        this.textN = textN;
    }

    public String[] getDateN() {
        return dateN;
    }

    public void setDateN(String[] dateN) {
        this.dateN = dateN;
    }

    @Override
    public String toString() {
        return "SavedNotes{" +
                "labelN=" + Arrays.toString(labelN) +
                ", textN=" + Arrays.toString(textN) +
                ", dateN=" + Arrays.toString(dateN) +
                '}';
    }
}