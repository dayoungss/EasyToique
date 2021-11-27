package com.example.toiquewordbook;

public class Word {

    int _id;
    String eng;
    String kor;
    String isChecked;


    public Word(int _id, String eng, String kor, String isChecked) {
        this._id = _id;
        this.eng = eng;
        this.kor = kor;
        this.isChecked = isChecked;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getKor() {
        return kor;
    }

    public void setKor(String kor) {
        this.kor = kor;
    }

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }
}
