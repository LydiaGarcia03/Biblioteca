package Metadata;

import java.util.ArrayList;

public interface IEntityCRUD<T> {
	
	MessageResponse<Integer> Inserir(T item);
    MessageResponse<Integer> Atualizar(T item);
    MessageResponse<Integer> Excluir(T item);
    MessageResponse<T> LerPorID(int id);
    MessageResponse<ArrayList<T>> LerTodos();
}
