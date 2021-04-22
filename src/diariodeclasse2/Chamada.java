package diariodeclasse2;

public class Chamada {

    private String aluno;
    private String presenca ;

    public Chamada(String aluno, String presenca){
        this.aluno=aluno;
        this.presenca=presenca;
    }

    public String getPresenca() {
        return presenca;
    }

    public void setPresenca(String presenca) {
        this.presenca = presenca;
    }
    public void setNome(String aluno){
        this.aluno = aluno;
    }
    public String getAluno(){
        return aluno;
    }
    @Override
    public String toString(){
        return "O aluno: " + aluno +" Estava: " + presenca;
    }
}
