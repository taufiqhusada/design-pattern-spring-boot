package com.blibli.desingpattern.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BuilderApplication {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Mahasiswa {
        private String nim;
        private String nama;
        private String alamat;
        private Date tanggalLahir;
        private List<String> hobi;
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNim("54321");
        mahasiswa1.setNama("Taufiq");
        mahasiswa1.setAlamat("Indonesia");
        mahasiswa1.setTanggalLahir(new Date());
        mahasiswa1.setHobi(Arrays.asList("Game", "Coding"));

        Mahasiswa mahasiswa2 = Mahasiswa.builder()
                .nim("12345")
                .nama("Taufiq")
                .alamat("Indonesia")
                .tanggalLahir(new Date())
                .hobi(Arrays.asList("Game", "Coding"))
                .build();

        System.out.println(mahasiswa1);
        System.out.println(mahasiswa2);
    }
}