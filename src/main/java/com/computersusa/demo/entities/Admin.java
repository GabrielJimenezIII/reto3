package com.computersusa.demo.entities;

import javax.persistence.*;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name="admin")
    public class Admin {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idAdmin;
        private String email;
        private String password;
        private String name;
    }

