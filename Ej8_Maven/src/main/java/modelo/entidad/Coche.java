package modelo.entidad;

public class Coche {

    private int id;
    private String marca;
    private String modelo;
    private int km;
    private String matricula;

    //  Diseño de tabla en BBDD
    //CREATE TABLE `ej03cochecrud`.`bbddcoches` (
    //        `id` INT NOT NULL AUTO_INCREMENT,
    //        `marca` VARCHAR(45) NOT NULL,
    //        `modelo` VARCHAR(45) NOT NULL,
    //        `km` INT NOT NULL,
    //        `matricula` VARCHAR(45) NOT NULL,
    //PRIMARY KEY (`id`));

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", km=" + km +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
