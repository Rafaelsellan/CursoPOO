class Curso{

    private String codigoCurso;
    private String nomeCurso;
    private String cargaHora;
    
    //Getters
    public String getCodigoCurso(){
        return codigoCurso;
    }
    public String getNomeCurso(){
        return nomeCurso;
    }
    public String getCargaHora(){
        return cargaHora;
    }

    //Setters
    public void setCodigoCurso (String ID){
        codigoCurso = ID;
    }

    public void setNomeCurso (String nome){
        nomeCurso = nome;
    }
    public void setCargaHora (String hora){
        cargaHora = hora;
    }
  
    Curso(String codigoCurso, String nomeCurso, String cargaHora){
        this.codigoCurso =  codigoCurso;
        this.nomeCurso = nomeCurso;
        this.cargaHora = cargaHora;      
    }

    //Faz a leitura das variaveis dentro da String, sem ela vai ler o nome do Array e um endereço da memoria ex: Cursos@123456
    @Override
    public String toString() {
        return "ID " + this.codigoCurso + ", Nome: " + this.nomeCurso + ", Carga Horaria " + this.cargaHora;
    }


    

}
