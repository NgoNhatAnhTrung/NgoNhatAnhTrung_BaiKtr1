package com.example.baikt1;

public class CaSi {
    private String TenCaSi;
    private String NgheDanh;
    private String QuocGia;
    private String SoSao;
    private int Hinh;

    public CaSi(String tencasi, String nghedanh, String quocgia, String sosao, int hinh) {
        TenCaSi = tencasi;
        NgheDanh = nghedanh;
        QuocGia = quocgia;
        SoSao = sosao;
        Hinh = hinh;
    }

    public String getTenCaSi() {
        return TenCaSi;
    }

    public void setTenCaSi(String tencasi) {
        TenCaSi = tencasi;
    }

    public String getNgheDanh() {
        return NgheDanh;
    }

    public void setNgheDanh(String nghedanh) {
        NgheDanh = nghedanh;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String quocGia) {
        QuocGia = quocGia;
    }

    public String setSoSao() {
        return SoSao;
    }

    public void setSoSao(String sosao) {
        SoSao = sosao;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public boolean getCaSi() {
        return false;
    }

    public int getSoSao() {
        return 0;
    }
}
