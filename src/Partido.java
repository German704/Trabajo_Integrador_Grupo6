public class Partido {

    public Partido(Integer id, Integer equipo1, Integer equipo2, Integer goles_equipo1, Integer goles_equipo2){
        this.id = id;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.goles_equipo1 = goles_equipo1;
        this.goles_equipo2 = goles_equipo2;
    }
    private Integer id;
    private Integer equipo1;
    private Integer equipo2;
    private Integer goles_equipo1;
    private Integer goles_equipo2;

    public ResultadoEnum resultado(Integer equipo){
        ResultadoEnum resultadoTrue = null;
        if(equipo == equipo1) {
            if (goles_equipo1 > goles_equipo2) {
                resultadoTrue = ResultadoEnum.GANADOR;
            } else if (goles_equipo1 == goles_equipo2) {
                resultadoTrue = ResultadoEnum.EMPATE;
            } else {
                resultadoTrue = ResultadoEnum.PERDEDOR;
            }
        }

        if(equipo == equipo2) {
            if (goles_equipo2 > goles_equipo1) {
                resultadoTrue = ResultadoEnum.GANADOR;
            } else if (goles_equipo2 == goles_equipo1) {
                resultadoTrue = ResultadoEnum.EMPATE;
            } else {
                resultadoTrue = ResultadoEnum.PERDEDOR;
            }
        }
        return resultadoTrue;
    }
    public String getData(){

        String info = "Partido: " + id +
                "\nEquipos: " + equipo1 + ", " + equipo2 +
                "\nGoles: " + "equipo1: " + goles_equipo1 + ", equipo2: " + goles_equipo2 +
                "\n-------------------------------";


        System.out.println(info);
        return info;
    }
    public String id(){
        String NroPartido = "" + id;
        System.out.println(NroPartido);
        return NroPartido;
    }
}
