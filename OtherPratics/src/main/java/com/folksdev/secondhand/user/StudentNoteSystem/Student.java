package com.folksdev.secondhand.user.StudentNoteSystem;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) this.mat.note = mat;
        if (fizik >= 0 && fizik <= 100) this.fizik.note = fizik;
        if (kimya >= 0 && kimya <= 100) this.kimya.note = kimya;
    }

    public void addBulkVerbalNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) this.mat.verbalNote = mat;
        if (fizik >= 0 && fizik <= 100) this.fizik.verbalNote = fizik;
        if (kimya >= 0 && kimya <= 100) this.kimya.verbalNote = kimya;
    }

    public void isPass() {
        this.avarage = calcAvarage();
        if (this.avarage > 55) {
            System.out.println("=========================");
            System.out.println("Sınıfı Geçti.");
            this.isPass = true;
        } else {
            System.out.println("=========================");
            System.out.println("Sınıfta Kaldı.");
            this.isPass = false;
        }
        printNote();
    }

    public double calcAvarage() {
        // Her dersin kendi ortalaması: (Sözlü * Etki) + (Sınav * (1 - Etki))
        double matAvg = (this.mat.note * (1 - this.mat.verbalWeight)) + (this.mat.verbalNote * this.mat.verbalWeight);
        double fizikAvg = (this.fizik.note * (1 - this.fizik.verbalWeight)) + (this.fizik.verbalNote * this.fizik.verbalWeight);
        double kimyaAvg = (this.kimya.note * (1 - this.kimya.verbalWeight)) + (this.kimya.verbalNote * this.kimya.verbalWeight);

        return (matAvg + fizikAvg + kimyaAvg) / 3.0;
    }

    public void printNote() {
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " | Sözlü : " + this.mat.verbalNote);
        System.out.println("Fizik Notu : " + this.fizik.note + " | Sözlü : " + this.fizik.verbalNote);
        System.out.println("Kimya Notu : " + this.kimya.note + " | Sözlü : " + this.kimya.verbalNote);
        System.out.println("Ortalama : " + this.avarage);
    }
}