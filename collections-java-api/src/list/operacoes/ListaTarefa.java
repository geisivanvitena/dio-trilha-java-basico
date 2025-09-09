package list.operacoes;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
        System.out.println("Tarefa removida com sucesso!");
    }
    
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Total de elementos: " + listaTarefa.obterNumeroTotalTarefas());
        System.out.println("_________________________________________________");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 3");
        System.out.println("Total de elementos: " + listaTarefa.obterNumeroTotalTarefas());
        System.out.println("Removendo tarefas");
        listaTarefa.removerTarefa("tarefa 2");
        listaTarefa.obterDescricaoTarefas();

    }
}
