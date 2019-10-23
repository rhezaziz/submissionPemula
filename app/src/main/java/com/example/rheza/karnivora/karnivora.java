package com.example.rheza.karnivora;

import android.os.Parcel;
import android.os.Parcelable;

public class karnivora implements Parcelable {
    private String nama, detail , deskirpsi;
    private int gambar;

    protected karnivora (Parcel in){
        nama = in.readString();
        detail = in.readString();
        deskirpsi = in.readString();
        gambar = in.readInt();

    }

    public static final Creator<karnivora> CREATOR = new Creator<karnivora>() {
        @Override
        public karnivora createFromParcel(Parcel in) {
            return new karnivora(in);
        }

        @Override
        public karnivora[] newArray(int size) {
            return new karnivora[size];
        }
    };

    public karnivora() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getDeskirpsi() {
        return deskirpsi;
    }

    public void setDeskirpsi(String deskirpsi) {
        this.deskirpsi = deskirpsi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nama);
        parcel.writeString(this.detail);
        parcel.writeString(this.deskirpsi);
        parcel.writeInt(this.gambar);
    }
}
