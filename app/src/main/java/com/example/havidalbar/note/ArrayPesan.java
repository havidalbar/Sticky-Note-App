package com.example.havidalbar.note;

public class ArrayPesan {
    private String pesan;
    private int layoutPesan;
    private String waktu;

    public ArrayPesan(String pesan, int layoutPesan, String waktu) {
        this.pesan = pesan;
        this.layoutPesan = layoutPesan;
        this.waktu = waktu;
    }

    public String getPesan() {
        return pesan;
    }

    public int getLayoutPesan() {
        return layoutPesan;
    }

    public String getWaktu() {
        return waktu;
    }
}

