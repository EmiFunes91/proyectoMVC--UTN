package com.proyectoUTN.models;

import java.util.Date;

public class UserDTO {

        private Long version;
        private String desarrollador;
        private Date fecha;

        public Long getVersion() {
            return version;
        }

        public void setVersion(Long version) {
            this.version = version;
        }

        public String getDesarrollador() {
            return desarrollador;
        }

        public void setDesarrollador(String desarrollador) {
            this.desarrollador = desarrollador;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
}

