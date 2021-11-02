public class Coche {
    private int id;
    private String marca;
    private String modelo;
    private int km;

    //  Diseño de tabla en BBDD
    // CREATE TABLE `coche` (
    //         `idCoche` int NOT NULL AUTO_INCREMENT,
    //         `marca` varchar(45) NOT NULL,
    //         `modelo` varchar(45) NOT NULL,
    //          `km` int NOT NULL,
    //          PRIMARY KEY (`idCoche`))

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


    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", km=" + km +
                '}';
    }
}
