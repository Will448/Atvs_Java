package Projeto_Escolar.Model;

public class Aluno {

    private int id;
    private String Nome;
    private String Dta_nascimento;
    private String Matricula;

    public Aluno(String Nome, String Matricula, String Dta_nascimento) {
        this.Nome = Nome;
        this.Matricula = Matricula;
        this.Dta_nascimento = Dta_nascimento;
    }

    public Aluno() {
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMatricula() {
        return this.Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getDta_nascimento() {
        return this.Dta_nascimento;
    }

    public void setDt_nascimento(String Dta_nascimento) {
        this.Dta_nascimento = Dta_nascimento;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + Nome + '\'' +
                ", dt_nascimento='" + Dta_nascimento + '\'' +
                ", matricula='" + Matricula + '\'' +
                '}';
    }
}