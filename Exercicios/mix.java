class Turma{

  private String nome;
  private Integer quantidadeAlunos;
  private boolean ativa;

  public Turma(String nome ,int quantidadeAlunos){
    this.nome = nome;
    this.quantidadeAlunos = quantidadeAlunos;
    this.ativa = true;
  }

  public void transferir(Turma destino, Integer quantidade){
    if(!destino.ativa){
      System.out.println("Turma de destino inativa")
        return;
  }
    if(quantidade <= 0){
      System.out.prinln("Quantidade a transferir deve ser maior que 0")
        return;
    }

    if(this.quantidadeAlunos < quantidade){
      System.out.println("Quantidade de alunos insuficiente")
        return;
    }

    this.quantidadeAlunos -= quantidade;
    destino.quantidadeAlunos += quantidade;
}
