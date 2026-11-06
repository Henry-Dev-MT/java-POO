public class Equipamento {
    private String identificacao;
    private String marca;
    private int anoAquisicao;

    public Equipamento(String identificacao, String marca, int anoAquisicao) {
        this.identificacao = identificacao;
        this.marca = marca;
        this.anoAquisicao = anoAquisicao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        if (identificacao != null) {
            this.identificacao = identificacao;
        }
        else{
            System.out.println("Identificação não pode estar vazia!");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
        }
        else{
            System.out.println("Marca não pode estar vazia!");
        }
    }

    public int getAnoAquisicao() {
        return anoAquisicao;
    }

    public void setAnoAquisicao(int anoAquisicao) {
        if (anoAquisicao > 2011 && anoAquisicao < 2026){
            this.anoAquisicao = anoAquisicao;
        }
        else {
            System.out.println("Ano de Aquisição invalido");
        }
    }
    public void apresentarEquip(){
        System.out.println("A identificação do Equipamento é: " + identificacao);
        System.out.println("A Marca do Equipamento é: " + marca);
        System.out.println("O Ano do Equipamento é:  " + anoAquisicao);
    }
}
