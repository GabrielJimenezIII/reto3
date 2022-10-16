package com.computersusa.demo.entities;

import javax.persistence.*;



    @Entity
    @Table(name="admin")
    public class Admin {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idAdmin;
        private String email;
        private String password;
        private String name;

        public Long getIdAdmin() {
            return idAdmin;
        }

        public void setIdAdmin(Long idAdmin) {
            this.idAdmin = idAdmin;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

