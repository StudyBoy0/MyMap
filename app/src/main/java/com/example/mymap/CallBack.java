package com.example.mymap;

public interface CallBack<T> {
    void success(T result) ;
    void failed(String errorMsg);
}
