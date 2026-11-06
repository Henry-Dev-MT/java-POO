public class Periferico extends Equipamento{
    private String tipo;
    private String estado;

    public Periferico(String identificacao, String marca, int anoAquisicao, String tipo, String estado) {
        super(identificacao, marca, anoAquisicao);
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        }
        else{
            System.out.println("Este campo não pode estar vazio!");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado != null) {
            this.estado = estado;
        } else {
            System.out.println("Este campo não pode estar vazio!");
        }
    }

    @Override
    public void apresentarEquip() {
        super.apresentarEquip();
        System.out.println("Tipo: " + tipo);
        System.out.println("Estado: " + estado);
    }
}

