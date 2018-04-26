package me.stonerivers.model.requset;

/**
 * Created by ZhangYuanan on 2017/12/30.
 */
public class MainReq {

    private String keyWord;

    public MainReq() {
    }

    public MainReq(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public MainReq setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
}
