public class Computador extends Equipamento{
    private int memoriaRAM;
    private String sistemaOperacional;

    public Computador(String identificacao, String marca, int anoAquisicao, int memoriaRAM, String sistemaOperacional) {
        super(identificacao, marca, anoAquisicao);
        this.memoriaRAM = memoriaRAM;
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getMamoriaRAM() {
        return memoriaRAM;
    }

    public void setMamoriaRAM(int mamoriaRAM) {
        if (memoriaRAM > 0) {
            this.memoriaRAM = mamoriaRAM;
        }
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        if (sistemaOperacional != null) {
            this.sistemaOperacional = sistemaOperacional;
        }
        else{
            System.out.println("Este campo não pode estar vazio!");
        }
    }

    @Override
    public void apresentarEquip(){
        super.apresentarEquip();
        System.out.println("Memoria RAM: " + memoriaRAM + "GB");
        System.out.println("Sistema Operacional: " + sistemaOperacional);

    }
}
