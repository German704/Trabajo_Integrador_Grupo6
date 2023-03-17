public class Equipo {
    public Equipo(Integer id, String nombre, String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Integer id;
    private String nombre;
    private String descripcion;

    public String getData(){
        String equipoInfo = "Equipo: " + id +
                "\nNombre: " + nombre +
                "\nDescripcion: " + descripcion +
                "\n-------------------------------";

        System.out.println(equipoInfo);
        return equipoInfo;
    }
    public String id(){
        String NroEquipo = "" + id;
        System.out.println(NroEquipo);
        return NroEquipo;
    }

}
